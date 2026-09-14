package ro.example.bankapi.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "Create account request")
public record CreateAccountRequest(
    
    @NotBlank(message = "Currency is required")
    @Pattern(regexp = "EUR|USD|RON|GBP", message = "Currency must be EUR, USD, RON, or GBP")
    @Schema(description = "Account currency", example = "EUR")
    String currency
) {}
