package ro.example.bankapi.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "Account response")
public record AccountResponse(
    
    @Schema(description = "Account ID", example = "1")
    Long id,
    
    @Schema(description = "Account number", example = "ACC-001-EUR-2024")
    String accountNumber,
    
    @Schema(description = "Account currency", example = "EUR")
    String currency,
    
    @Schema(description = "Account balance", example = "1000.00")
    BigDecimal balance,
    
    @Schema(description = "Account status", example = "ACTIVE")
    String status,
    
    @Schema(description = "Creation timestamp")
    LocalDateTime createdAt,
    
    @Schema(description = "Last update timestamp")
    LocalDateTime updatedAt
) {}
