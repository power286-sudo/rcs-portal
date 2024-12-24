// /com/rcs/portal/message/service/MessageServiceImpl.java
package com.rcs.portal.message.service;

import com.rcs.portal.message.dto.MessageSendRequest;
import com.rcs.portal.message.dto.MessageSendResponse;
import com.rcs.portal.message.dto.RecipientUploadResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * 메시지 발송 관련 비즈니스 로직을 처리하는 서비스 구현체입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    @Override
    public RecipientUploadResponse uploadRecipients(MultipartFile file) {
        // 구현 로직
        return RecipientUploadResponse.builder()
                .messageGroupId("temp")
                .status("UPLOADING")
                .totalCount(0)
                .build();
    }

    @Override
    public MessageSendResponse sendMessage(MessageSendRequest request) {
        // 구현 로직
        return MessageSendResponse.builder()
                .messageGroupId(request.getMessageGroupId())
                .status("SENDING")
                .build();
    }
}