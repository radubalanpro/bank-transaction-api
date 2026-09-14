package ro.example.bankapi.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "User registration request")
public record RegisterRequest(
    
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 100, message = "Username must be between 3 and 100 characters")
    @Schema(description = "Username", example = "john.doe")
    String username,
    
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    @Schema(description = "Email address", example = "john@example.com")
    String email,
    
    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters")
    @Schema(description = "Password", example = "SecurePass123!")
    String password,
    
    @NotBlank(message = "First name is required")
    @Schema(description = "First name", example = "John")
    String firstName,
    
    @NotBlank(message = "Last name is required")
    @Schema(description = "Last name", example = "Doe")
    String lastName
) {}
