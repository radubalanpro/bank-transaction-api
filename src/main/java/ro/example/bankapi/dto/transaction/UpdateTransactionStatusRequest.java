package ro.example.bankapi.dto.transaction;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "Update transaction status request")
public record UpdateTransactionStatusRequest(
    
    @NotBlank(message = "Status is required")
    @Pattern(regexp = "COMPLETED|FAILED|CANCELLED", message = "Status must be COMPLETED, FAILED, or CANCELLED")
    @Schema(description = "New transaction status", example = "COMPLETED")
    String status,
    
    @Schema(description = "Reason for status change", example = "Manual cancellation by operator")
    String reason
) {}
