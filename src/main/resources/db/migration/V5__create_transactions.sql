CREATE TABLE `transactions` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `account_id` BIGINT NOT NULL,
  `amount` DECIMAL(19,4) NOT NULL,
  `currency` VARCHAR(3) NOT NULL,
  `type` VARCHAR(20) NOT NULL,
  `status` VARCHAR(20) NOT NULL DEFAULT 'PENDING',
  `description` VARCHAR(500),
  `reference` VARCHAR(100) NOT NULL UNIQUE,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `completed_at` TIMESTAMP NULL,
  `created_by` BIGINT,
  `updated_by` BIGINT,
  `version` BIGINT NOT NULL DEFAULT 0,
  
  FOREIGN KEY (account_id) REFERENCES accounts(id) ON DELETE RESTRICT,
  FOREIGN KEY (created_by) REFERENCES users(id) ON DELETE SET NULL,
  FOREIGN KEY (updated_by) REFERENCES users(id) ON DELETE SET NULL,
  
  INDEX idx_account_id (account_id),
  INDEX idx_status (status),
  INDEX idx_type (type),
  INDEX idx_currency (currency),
  INDEX idx_reference (reference),
  INDEX idx_created_at (created_at),
  INDEX idx_account_status_created (account_id, status, created_at),
  
  CHECK (amount > 0),
  CHECK (type IN ('DEBIT', 'CREDIT')),
  CHECK (status IN ('PENDING', 'COMPLETED', 'FAILED', 'CANCELLED')),
  CHECK (currency IN ('EUR', 'USD', 'RON', 'GBP'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;