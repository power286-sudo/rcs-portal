// /com/rcs/portal/auth/dto/LoginRequest.java
package com.rcs.portal.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 로그인 요청 정보를 담는 DTO 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@NoArgsConstructor
@Schema(description = "로그인 요청")
public class LoginRequest {
    @NotBlank(message = "기업 ID는 필수입니다")
    @Schema(description = "기업 ID", example = "company123")
    private String masterId;

    @NotBlank(message = "사용자 ID는 필수입니다")
    @Schema(description = "사용자 ID", example = "user123")
    private String userId;

    @NotBlank(message = "비밀번호는 필수입니다")
    @Schema(description = "비밀번호", example = "password123")
    private String password;
}