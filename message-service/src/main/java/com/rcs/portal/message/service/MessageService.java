// /com/rcs/portal/message/service/MessageService.java
package com.rcs.portal.message.service;

import com.rcs.portal.message.dto.MessageSendRequest;
import com.rcs.portal.message.dto.MessageSendResponse;
import com.rcs.portal.message.dto.RecipientUploadResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * 메시지 발송 관련 비즈니스 로직을 처리하는 서비스 인터페이스입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
public interface MessageService {
    /**
     * 수신자 정보 파일을 업로드하고 처리합니다.
     *
     * @param file 수신자 정보 파일
     * @return 업로드 결과
     */
    RecipientUploadResponse uploadRecipients(MultipartFile file);

    /**
     * 메시지를 발송합니다.
     *
     * @param request 메시지 발송 요청 정보
     * @return 발송 결과
     */
    MessageSendResponse sendMessage(MessageSendRequest request);
}