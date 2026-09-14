package ro.example.bankapi.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;

@Schema(description = "Update user profile request")
public record UpdateUserRequest(
    
    @Schema(description = "First name", example = "John")
    String firstName,
    
    @Schema(description = "Last name", example = "Doe")
    String lastName,
    
    @Email(message = "Email must be valid")
    @Schema(description = "Email address", example = "john@example.com")
    String email
) {}
