// /com/rcs/portal/auth/service/AuthService.java
package com.rcs.portal.auth.service;

import com.rcs.portal.auth.dto.LoginRequest;
import com.rcs.portal.auth.dto.LoginResponse;
import com.rcs.portal.auth.dto.TokenVerifyResponse;

/**
 * 인증 관련 비즈니스 로직을 처리하는 서비스 인터페이스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
public interface AuthService {
    /**
     * 사용자 로그인을 처리합니다.
     *
     * @param request 로그인 요청 정보
     * @return 로그인 응답 정보
     */
    LoginResponse login(LoginRequest request);

    /**
     * JWT 토큰의 유효성을 검증합니다.
     *
     * @param token JWT 토큰
     * @return 토큰 검증 결과
     */
    TokenVerifyResponse verifyToken(String token);
}