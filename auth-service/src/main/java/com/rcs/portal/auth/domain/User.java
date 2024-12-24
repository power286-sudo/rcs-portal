// /com/rcs/portal/auth/domain/User.java
package com.rcs.portal.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * 사용자 정보를 저장하는 엔티티 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class User {
    @Id
    private String userId;
    private String masterId;
    private String password;
    private String role;
    private String refreshToken;
    private LocalDateTime tokenExpiredAt;
    private String status;
    private LocalDateTime lastLoginAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}