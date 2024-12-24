// /com/rcs/portal/common/dto/ApiResponse.java
package com.rcs.portal.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * API 응답을 위한 공통 응답 클래스입니다.
 *
 * @param <T> 응답 데이터의 타입
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ApiResponse<T> {
    private Integer status;
    private String message;
    private T data;
    private LocalDateTime timestamp;

    private ApiResponse(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "Success", data);
    }

    public static <T> ApiResponse<T> error(Integer status, String message) {
        return new ApiResponse<>(status, message, null);
    }
}