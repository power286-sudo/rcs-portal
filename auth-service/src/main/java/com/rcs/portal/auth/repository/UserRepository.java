// /com/rcs/portal/auth/repository/UserRepository.java
package com.rcs.portal.auth.repository;

import com.rcs.portal.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 사용자 정보 관련 데이터베이스 작업을 처리하는 레포지토리입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserId(String userId);
}