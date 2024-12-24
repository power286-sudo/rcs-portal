// /com/rcs/portal/message/dto/MessageSendResponse.java
package com.rcs.portal.message.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

/**
 * 메시지 발송 응답 정보를 담는 DTO 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@Builder
@Schema(description = "메시지 발송 응답")
public class MessageSendResponse {
    @Schema(description = "메시지 그룹 ID", example = "group123")
    private String messageGroupId;

    @Schema(description = "발송 상태", example = "SENDING")
    private String status;
}