// /com/rcs/portal/auth/service/AuthServiceImpl.java
package com.rcs.portal.auth.service;

import com.rcs.portal.auth.dto.LoginRequest;
import com.rcs.portal.auth.dto.LoginResponse;
import com.rcs.portal.auth.dto.TokenVerifyResponse;
import com.rcs.portal.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 인증 관련 비즈니스 로직을 처리하는 서비스 구현체입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public LoginResponse login(LoginRequest request) {
        // 로그인 로직 구현
        return new LoginResponse(
                "dummy_access_token",
                "dummy_refresh_token"
        );
    }

    @Override
    public TokenVerifyResponse verifyToken(String token) {
        // 토큰 검증 로직 구현
        return new TokenVerifyResponse(
                true,
                "dummy_user_id"
        );
    }
}