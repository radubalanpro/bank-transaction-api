CREATE TABLE `accounts` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `user_id` BIGINT NOT NULL,
  `account_number` VARCHAR(50) NOT NULL UNIQUE,
  `currency` VARCHAR(3) NOT NULL,
  `balance` DECIMAL(19,4) NOT NULL DEFAULT 0,
  `status` VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
  INDEX idx_user_id (user_id),
  INDEX idx_account_number (account_number),
  INDEX idx_currency (currency),
  INDEX idx_status (status),
  
  CHECK (balance >= 0),
  CHECK (status IN ('ACTIVE', 'BLOCKED', 'CLOSED')),
  CHECK (currency IN ('EUR', 'USD', 'RON', 'GBP'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;