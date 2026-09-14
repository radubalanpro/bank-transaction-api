package ro.example.bankapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Transaction domain model.
 * 
 * Business Rules:
 * - Amount must always be > 0
 * - Type: DEBIT or CREDIT
 * - Status: PENDING, COMPLETED, FAILED, CANCELLED
 * - Reference must be unique
 * - Uses optimistic locking via version field
 * 
 * State Machine:
 * PENDING -> COMPLETED (debit after sufficient balance check)
 * PENDING -> COMPLETED (credit without checks)
 * PENDING -> FAILED
 * PENDING -> CANCELLED
 * COMPLETED -> CANCELLED (only if business rules allow)
 * FAILED -> no transition
 * CANCELLED -> no transition
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    private Long id;
    private Long accountId;
    private BigDecimal amount;
    private String currency;
    private String type;
    private String status;
    private String description;
    private String reference;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime completedAt;
    private Long createdBy;
    private Long updatedBy;
    private Long version;
}
