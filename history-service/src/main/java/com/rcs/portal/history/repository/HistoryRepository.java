// /com/rcs/portal/history/repository/HistoryRepository.java
package com.rcs.portal.history.repository;

import com.rcs.portal.history.domain.MessageHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HistoryRepository extends MongoRepository<MessageHistory, String> {
}