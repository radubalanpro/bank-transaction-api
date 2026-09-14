CREATE TABLE `audit_events` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `user_id` BIGINT,
  `event_type` VARCHAR(50) NOT NULL,
  `resource_type` VARCHAR(50),
  `resource_id` BIGINT,
  `http_method` VARCHAR(10),
  `endpoint` VARCHAR(500),
  `status_code` INT,
  `ip_address` VARCHAR(45),
  `user_agent` VARCHAR(500),
  `correlation_id` VARCHAR(100),
  `metadata` JSON,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL,
  INDEX idx_user_id (user_id),
  INDEX idx_event_type (event_type),
  INDEX idx_resource_type (resource_type),
  INDEX idx_created_at (created_at),
  INDEX idx_correlation_id (correlation_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;