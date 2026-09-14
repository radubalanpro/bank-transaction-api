package ro.example.bankapi.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "Update account status request")
public record UpdateAccountStatusRequest(
    
    @NotBlank(message = "Status is required")
    @Pattern(regexp = "ACTIVE|BLOCKED|CLOSED", message = "Status must be ACTIVE, BLOCKED, or CLOSED")
    @Schema(description = "New account status", example = "BLOCKED")
    String status
) {}
