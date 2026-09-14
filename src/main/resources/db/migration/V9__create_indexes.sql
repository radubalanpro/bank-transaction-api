-- Additional indexes for performance optimization

-- Transaction queries with filters
CREATE INDEX idx_transactions_account_created 
ON transactions(account_id, created_at DESC);

CREATE INDEX idx_transactions_status_created 
ON transactions(status, created_at DESC);

CREATE INDEX idx_transactions_type_status 
ON transactions(type, status);

-- Account queries
CREATE INDEX idx_accounts_user_status 
ON accounts(user_id, status);

-- Audit queries
CREATE INDEX idx_audit_events_user_created 
ON audit_events(user_id, created_at DESC);

CREATE INDEX idx_audit_events_event_created 
ON audit_events(event_type, created_at DESC);

-- User queries
CREATE INDEX idx_users_enabled 
ON users(enabled, created_at DESC);