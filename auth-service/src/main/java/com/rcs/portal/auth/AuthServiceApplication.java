// /com/rcs/portal/auth/AuthServiceApplication.java
package com.rcs.portal.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 인증 서비스 애플리케이션의 시작점입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@SpringBootApplication
public class AuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }
}