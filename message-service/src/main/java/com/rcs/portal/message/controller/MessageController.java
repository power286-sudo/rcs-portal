// /com/rcs/portal/message/controller/MessageController.java
package com.rcs.portal.message.controller;

import com.rcs.portal.common.dto.ApiResponse;
import com.rcs.portal.message.service.MessageService;
import com.rcs.portal.message.dto.MessageSendRequest;  // 이 import 구문 추가
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 메시지 전송 관련 API를 제공하는 컨트롤러입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
@Tag(name = "메시지 API", description = "메시지 전송 관련 API")
public class MessageController {
    private final MessageService messageService;

    @Operation(summary = "수신자 파일 업로드", description = "수신자 정보 파일을 업로드합니다")
    @PostMapping("/recipients/upload")
    public ApiResponse<?> uploadRecipients(@RequestParam("file") MultipartFile file) {
        return ApiResponse.success(messageService.uploadRecipients(file));
    }

    @Operation(summary = "메시지 발송", description = "메시지를 발송합니다")
    @PostMapping("/send")
    public ApiResponse<?> sendMessage(@RequestBody MessageSendRequest request) {
        return ApiResponse.success(messageService.sendMessage(request));
    }
}