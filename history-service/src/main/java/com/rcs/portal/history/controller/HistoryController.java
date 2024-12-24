// /com/rcs/portal/history/controller/HistoryController.java
package com.rcs.portal.history.controller;

import com.rcs.portal.common.dto.ApiResponse;
import com.rcs.portal.history.service.HistoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 메시지 이력 조회 관련 API를 제공하는 컨트롤러입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
@Tag(name = "이력 조회 API", description = "메시지 이력 조회 관련 API")
public class HistoryController {
    private final HistoryService historyService;

    @Operation(summary = "메시지 이력 조회", description = "메시지 발송 이력을 조회합니다")
    @GetMapping("/messages")
    public ApiResponse<?> searchMessages(@RequestParam String startDate,
                                         @RequestParam String endDate,
                                         @RequestParam(required = false) String brandId,
                                         @RequestParam(required = false) String messageGroupId) {
        return ApiResponse.success(historyService.searchMessages(startDate, endDate, brandId, messageGroupId));
    }
}