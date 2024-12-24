// /com/rcs/portal/history/service/HistoryService.java
package com.rcs.portal.history.service;

import com.rcs.portal.history.dto.MessageHistoryResponse;
import org.springframework.data.domain.Page;

public interface HistoryService {
    Page<MessageHistoryResponse> searchMessages(String startDate,
                                                String endDate,
                                                String brandId,
                                                String messageGroupId);
}