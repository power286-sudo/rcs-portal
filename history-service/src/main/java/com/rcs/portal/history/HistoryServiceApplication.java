// /com/rcs/portal/history/HistoryServiceApplication.java
package com.rcs.portal.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 이력 조회 서비스 애플리케이션의 시작점입니다.
 *
 * @author RCS Portal Team
 * @version 1.0
 */
@SpringBootApplication
public class HistoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoryServiceApplication.class, args);
    }
}