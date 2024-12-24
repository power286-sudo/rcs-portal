// /com/rcs/portal/message/dto/RecipientUploadResponse.java
package com.rcs.portal.message.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

/**
 * 수신자 정보 업로드 응답 정보를 담는 DTO 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@Builder
@Schema(description = "수신자 정보 업로드 응답")
public class RecipientUploadResponse {
    @Schema(description = "메시지 그룹 ID", example = "group123")
    private String messageGroupId;

    @Schema(description = "처리 상태", example = "UPLOADING")
    private String status;

    @Schema(description = "전체 건수", example = "1000")
    private int totalCount;
}