package ro.example.bankapi.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Authentication response")
public record AuthResponse(
    
    @Schema(description = "JWT access token", example = "eyJhbGc...")
    String accessToken,
    
    @Schema(description = "Token type", example = "Bearer")
    String tokenType,
    
    @Schema(description = "Access token expiration in seconds", example = "3600")
    Long expiresIn,
    
    @Schema(description = "Refresh token for obtaining new access tokens")
    String refreshToken,
    
    @Schema(description = "User ID", example = "123")
    Long userId,
    
    @Schema(description = "Username", example = "john.doe")
    String username
) {}
