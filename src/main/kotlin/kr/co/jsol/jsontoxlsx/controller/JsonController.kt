package kr.co.jsol.jsontoxlsx.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import kr.co.jsol.jsontoxlsx.service.JsonService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("")
class JsonController (
    private val jsonService: JsonService,
){
    private val log = LoggerFactory.getLogger(this::class.java)

    @Operation(summary = "health check.")
    @ApiResponses(ApiResponse(responseCode = "200", description = "성공"))
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun getHealCheck(): String {
        return "OK"
    }

    @Operation(summary = "labeled_data.json파일을 읽어 lettuce.xlsx파일로 변환한다.")
    @ApiResponses(ApiResponse(responseCode = "200", description = "성공, 파일 경로 반환"))
    @PostMapping("/api/json", consumes = ["multipart/form-data"])
    @ResponseStatus(HttpStatus.OK)
    fun getJsonToXlsx(
        // json파일을 입력받는다.
        @RequestParam("files") files: List<MultipartFile>,
    ): String {
        return jsonService.parseToXlsx(files)
    }
}
