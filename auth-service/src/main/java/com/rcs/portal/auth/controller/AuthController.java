// /com/rcs/portal/auth/controller/AuthController.java
package com.rcs.portal.auth.controller;

import com.rcs.portal.auth.dto.LoginRequest;
import com.rcs.portal.auth.service.AuthService;
import com.rcs.portal.common.dto.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 인증 관련 API를 제공하는 컨트롤러입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "인증 API", description = "인증 관련 API")
public class AuthController {
    private final AuthService authService;

    @Operation(summary = "로그인", description = "사용자 로그인을 처리합니다")
    @PostMapping("/login")
    public ApiResponse<?> login(@RequestBody LoginRequest request) {
        return ApiResponse.success(authService.login(request));
    }

    @Operation(summary = "토큰 검증", description = "JWT 토큰의 유효성을 검증합니다")
    @GetMapping("/verify")
    public ApiResponse<?> verifyToken(@RequestHeader("Authorization") String token) {
        return ApiResponse.success(authService.verifyToken(token));
    }
}