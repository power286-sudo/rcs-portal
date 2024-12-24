// /com/rcs/portal/message/MessageServiceApplication.java
package com.rcs.portal.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 메시지 서비스 애플리케이션의 시작점입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@SpringBootApplication
public class MessageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApplication.class, args);
    }
}