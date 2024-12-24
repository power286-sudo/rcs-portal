    url: jdbc:postgresql://localhost:5432/rcsportal
    username: postgres
    password: postgres


# 테이블 생성 SQL 실행
CREATE TABLE users (
    user_id VARCHAR(50) PRIMARY KEY,
    master_id VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL,
    refresh_token VARCHAR(255),
    token_expired_at TIMESTAMP,
    status VARCHAR(20) NOT NULL,
    last_login_at TIMESTAMP,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE messages (
    message_id VARCHAR(50) PRIMARY KEY,
    message_group_id VARCHAR(50) NOT NULL,
    master_id VARCHAR(50) NOT NULL,
    brand_id VARCHAR(50) NOT NULL,
    content TEXT,
    status VARCHAR(20) NOT NULL,
    result_code VARCHAR(20),
    result_message VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 필요한 다른 테이블들도 생성
CREATE TABLE message_groups (
    message_group_id VARCHAR(50) PRIMARY KEY,
    master_id VARCHAR(50) NOT NULL,
    brand_id VARCHAR(50) NOT NULL,
    template_id VARCHAR(50) NOT NULL,
    chatbot_id VARCHAR(50) NOT NULL,
    status VARCHAR(20) NOT NULL,
    total_count INTEGER DEFAULT 0,
    processed_count INTEGER DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE recipients (
    recipient_id VARCHAR(50) PRIMARY KEY,
    message_group_id VARCHAR(50) NOT NULL,
    encrypted_phone VARCHAR(255) NOT NULL,
    processing_status VARCHAR(20) NOT NULL,
    error_code VARCHAR(20),
    error_message VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (message_group_id) REFERENCES message_groups(message_group_id)
);