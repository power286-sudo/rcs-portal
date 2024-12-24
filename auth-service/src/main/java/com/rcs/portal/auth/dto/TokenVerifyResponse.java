// /com/rcs/portal/auth/dto/TokenVerifyResponse.java
package com.rcs.portal.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 토큰 검증 응답 정보를 담는 DTO 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "토큰 검증 응답")
public class TokenVerifyResponse {
    @Schema(description = "토큰 유효 여부", example = "true")
    private boolean isValid;

    @Schema(description = "사용자 ID", example = "user123")
    private String userId;
}