// /com/rcs/portal/history/domain/MessageHistory.java
package com.rcs.portal.history.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter
@Document(collection = "message_history")
@NoArgsConstructor
public class MessageHistory {
    @Id
    private String id;
    private String messageId;
    private String messageGroupId;
    private String masterId;
    private String brandId;
    private String content;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}