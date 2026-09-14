package ro.example.bankapi.dto.transaction;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Transaction filtering parameters.
 * All fields are optional.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Transaction filter parameters")
public class TransactionFilterRequest {
    
    @Parameter(description = "Account ID")
    private Long accountId;
    
    @Parameter(description = "Transaction status")
    @Pattern(regexp = "PENDING|COMPLETED|FAILED|CANCELLED", 
        message = "Status must be PENDING, COMPLETED, FAILED, or CANCELLED")
    private String status;
    
    @Parameter(description = "Transaction type")
    @Pattern(regexp = "DEBIT|CREDIT", message = "Type must be DEBIT or CREDIT")
    private String type;
    
    @Parameter(description = "Currency")
    @Pattern(regexp = "EUR|USD|RON|GBP", message = "Currency must be EUR, USD, RON, or GBP")
    private String currency;
    
    @Parameter(description = "Reference")
    private String reference;
    
    @Parameter(description = "Minimum amount")
    @DecimalMin(value = "0", message = "Minimum amount must be >= 0")
    private BigDecimal minAmount;
    
    @Parameter(description = "Maximum amount")
    @DecimalMin(value = "0", message = "Maximum amount must be >= 0")
    private BigDecimal maxAmount;
    
    @Parameter(description = "Created from datetime")
    private LocalDateTime createdFrom;
    
    @Parameter(description = "Created to datetime")
    private LocalDateTime createdTo;
}
