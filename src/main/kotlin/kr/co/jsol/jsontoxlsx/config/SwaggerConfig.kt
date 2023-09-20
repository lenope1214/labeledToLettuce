package kr.co.jsol.jsontoxlsx.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class SwaggerConfig {

    @Bean
    fun openAPI(@Value("\${springdoc.version:0.0.0}") appVersion: String?): OpenAPI {
        val info = Info()
            .title("Jsolution Laundry API")
            .description("제이솔루션 내부 프로젝트")
            .version("v0.0.1")

        val jwtScheme: SecurityScheme = SecurityScheme()
            .name("Authorization")
            .type(SecurityScheme.Type.HTTP)
            .`in`(SecurityScheme.In.HEADER)
            .bearerFormat("JWT")
            .scheme("bearer")

        return OpenAPI()
            .components(
                Components().addSecuritySchemes(
                    "Authorization", jwtScheme
                )
            )
            .info(info)
            .security(listOf(SecurityRequirement().addList("Authorization")))
    }
}
