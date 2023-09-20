package kr.co.jsol.jsontoxlsx.controller.dto

import org.springframework.web.multipart.MultipartFile

data class ControllerInputDto(
    val data: String,

    val files: List<MultipartFile>,
)
