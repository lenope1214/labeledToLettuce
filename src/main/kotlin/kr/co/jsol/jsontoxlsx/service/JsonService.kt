package kr.co.jsol.jsontoxlsx.service

import kotlinx.serialization.json.Json
import kr.co.jsol.jsontoxlsx.data.LettuceData
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.FileOutputStream

@Service
class JsonService {
    private val log = LoggerFactory.getLogger(this::class.java)
    fun parseToXlsx(jsonFiles: List<MultipartFile>): String {
        log.info("jsonFiles: $jsonFiles")
        val outputExcelFile = File("output.xlsx")

        val workbook = XSSFWorkbook()
        val sheet = workbook.createSheet("Data")

        val headerRow = sheet.createRow(0)
        headerRow.createCell(0).setCellValue("format")
        headerRow.createCell(1).setCellValue("id")
        headerRow.createCell(2).setCellValue("name")
        headerRow.createCell(3).setCellValue("path")
        headerRow.createCell(4).setCellValue("type")
        headerRow.createCell(5).setCellValue("tags")
        headerRow.createCell(6).setCellValue("boundingBox")
        headerRow.createCell(7).setCellValue("height")
        headerRow.createCell(8).setCellValue("width")
        headerRow.createCell(9).setCellValue("left")
        headerRow.createCell(10).setCellValue("top")
        headerRow.createCell(11).setCellValue("x")
        headerRow.createCell(12).setCellValue("y")






        var rowIndex = 1
        jsonFiles.forEach { jsonFile ->
            val jsonContent = jsonFile.inputStream.readBytes().toString(Charsets.UTF_8)
            val lettuceData: LettuceData = parseLabeledToLettuce(jsonContent)

            val dataRow = sheet.createRow(rowIndex++)
            dataRow.createCell(0).setCellValue(lettuceData.asset.format)
            dataRow.createCell(1).setCellValue(lettuceData.asset.id)
            dataRow.createCell(2).setCellValue(lettuceData.asset.name)
            dataRow.createCell(3).setCellValue(lettuceData.asset.path)
            dataRow.createCell(4).setCellValue(lettuceData.asset.type.toString())
            dataRow.createCell(5).setCellValue(lettuceData.regions[0].tags[0])
            dataRow.createCell(6).setCellValue("Y")
            dataRow.createCell(7).setCellValue(lettuceData.regions[0].boundingBox.height)
            dataRow.createCell(8).setCellValue(lettuceData.regions[0].boundingBox.width)
            dataRow.createCell(9).setCellValue(lettuceData.regions[0].boundingBox.left)
            dataRow.createCell(10).setCellValue(lettuceData.regions[0].boundingBox.top)
            dataRow.createCell(11).setCellValue(lettuceData.regions[0].points[0].x)
            dataRow.createCell(12).setCellValue(lettuceData.regions[0].points[0].y)
        }

        // Save the workbook to the output Excel file
        FileOutputStream(outputExcelFile).use { fileOut ->
            workbook.write(fileOut)
            // 파일명과 파일 경로 출력

        }
        log.info("file name: ${outputExcelFile.name}")
        log.info("file path: ${outputExcelFile.absolutePath}")
        return outputExcelFile.absolutePath
    }

    private fun parseLabeledToLettuce(jsonContent: String): LettuceData = Json.decodeFromString<LettuceData>(jsonContent)
}
