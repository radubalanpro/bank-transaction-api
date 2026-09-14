package ro.example.bankapi.dto.transaction;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.math.BigDecimal;

@Schema(description = "Create transaction request")
public record CreateTransactionRequest(
    
    @NotNull(message = "Account ID is required")
    @Schema(description = "Target account ID", example = "1")
    Long accountId,
    
    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    @Schema(description = "Transaction amount", example = "100.50")
    BigDecimal amount,
    
    @NotBlank(message = "Currency is required")
    @Pattern(regexp = "EUR|USD|RON|GBP", message = "Currency must be EUR, USD, RON, or GBP")
    @Schema(description = "Transaction currency", example = "EUR")
    String currency,
    
    @NotBlank(message = "Type is required")
    @Pattern(regexp = "DEBIT|CREDIT", message = "Type must be DEBIT or CREDIT")
    @Schema(description = "Transaction type", example = "DEBIT")
    String type,
    
    @Schema(description = "Transaction description", example = "Payment for invoice #123")
    String description,
    
    @NotBlank(message = "Reference is required")
    @Schema(description = "Unique reference", example = "REF-2024-001")
    String reference
) {}
