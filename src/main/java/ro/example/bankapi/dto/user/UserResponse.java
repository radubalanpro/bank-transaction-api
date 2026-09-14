package ro.example.bankapi.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.Set;

@Schema(description = "User response")
public record UserResponse(
    
    @Schema(description = "User ID", example = "1")
    Long id,
    
    @Schema(description = "Username", example = "john.doe")
    String username,
    
    @Schema(description = "Email", example = "john@example.com")
    String email,
    
    @Schema(description = "First name", example = "John")
    String firstName,
    
    @Schema(description = "Last name", example = "Doe")
    String lastName,
    
    @Schema(description = "Whether user is enabled", example = "true")
    Boolean enabled,
    
    @Schema(description = "Whether account is locked", example = "false")
    Boolean accountNonLocked,
    
    @Schema(description = "User roles", example = "[\"ROLE_USER\"]")
    Set<String> roles,
    
    @Schema(description = "Creation timestamp")
    LocalDateTime createdAt,
    
    @Schema(description = "Last login timestamp")
    LocalDateTime lastLoginAt
) {}
