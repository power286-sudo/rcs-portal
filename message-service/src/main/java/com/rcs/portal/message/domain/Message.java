// /com/rcs/portal/message/domain/Message.java
package com.rcs.portal.message.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * 메시지 정보를 저장하는 엔티티 클래스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Entity
@Table(name = "messages")
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Message {
    @Id
    private String messageId;
    private String messageGroupId;
    private String masterId;
    private String brandId;
    private String content;

    @Enumerated(EnumType.STRING)
    private MessageStatus status;
    private String resultCode;
    private String resultMessage;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum MessageStatus {
        PENDING, SENDING, SENT, FAILED
    }
}