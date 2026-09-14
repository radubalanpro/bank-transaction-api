package ro.example.bankapi.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Token refresh request")
public record RefreshTokenRequest(
    
    @NotBlank(message = "Refresh token is required")
    @Schema(description = "Refresh token from previous authentication", example = "...")
    String refreshToken
) {}
