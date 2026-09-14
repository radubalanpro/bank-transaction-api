package ro.example.bankapi.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "User login request")
public record LoginRequest(
    
    @NotBlank(message = "Username is required")
    @Schema(description = "Username", example = "john.doe")
    String username,
    
    @NotBlank(message = "Password is required")
    @Schema(description = "Password", example = "SecurePass123!")
    String password
) {}
