package ro.example.bankapi.dto.transaction;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "Transaction response")
public record TransactionResponse(
    
    @Schema(description = "Transaction ID", example = "1")
    Long id,
    
    @Schema(description = "Account ID", example = "1")
    Long accountId,
    
    @Schema(description = "Transaction amount", example = "100.50")
    BigDecimal amount,
    
    @Schema(description = "Transaction currency", example = "EUR")
    String currency,
    
    @Schema(description = "Transaction type", example = "DEBIT")
    String type,
    
    @Schema(description = "Transaction status", example = "COMPLETED")
    String status,
    
    @Schema(description = "Transaction description")
    String description,
    
    @Schema(description = "Unique reference", example = "REF-2024-001")
    String reference,
    
    @Schema(description = "Creation timestamp")
    LocalDateTime createdAt,
    
    @Schema(description = "Last update timestamp")
    LocalDateTime updatedAt,
    
    @Schema(description = "Completion timestamp")
    LocalDateTime completedAt,
    
    @Schema(description = "Current version for optimistic locking")
    Long version
) {}
