// /com/rcs/portal/message/dto/MessageSendRequest.java
package com.rcs.portal.message.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 메시지 발송 요청 정보를 담는 DTO 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Getter
@NoArgsConstructor
@Schema(description = "메시지 발송 요청")
public class MessageSendRequest {
    @Schema(description = "브랜드 ID", example = "brand123")
    private String brandId;

    @Schema(description = "템플릿 ID", example = "template123")
    private String templateId;

    @Schema(description = "챗봇 ID", example = "chatbot123")
    private String chatbotId;

    @Schema(description = "메시지 그룹 ID", example = "group123")
    private String messageGroupId;

    @Schema(description = "메시지 내용", example = "안녕하세요...")
    private String content;
}