// /com/rcs/portal/common/config/SwaggerConfig.java
package com.rcs.portal.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger 설정을 위한 Configuration 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RCS Portal API")
                        .description("RCS Portal API 문서")
                        .version("1.0"));
    }
}