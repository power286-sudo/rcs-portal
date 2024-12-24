// /com/rcs/portal/history/service/HistoryServiceImpl.java
package com.rcs.portal.history.service;

import com.rcs.portal.history.dto.MessageHistoryResponse;
import com.rcs.portal.history.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {
    private final HistoryRepository historyRepository;

    @Override
    public Page<MessageHistoryResponse> searchMessages(String startDate,
                                                       String endDate,
                                                       String brandId,
                                                       String messageGroupId) {
        // 구현 로직
        return Page.empty(); // 임시 반환
    }
}