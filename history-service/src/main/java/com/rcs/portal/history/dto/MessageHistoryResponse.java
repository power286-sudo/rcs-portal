// /com/rcs/portal/history/dto/MessageHistoryResponse.java
package com.rcs.portal.history.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MessageHistoryResponse {
    private String messageId;
    private String messageGroupId;
    private String brandId;
    private String content;
    private String status;
    private LocalDateTime createdAt;
}