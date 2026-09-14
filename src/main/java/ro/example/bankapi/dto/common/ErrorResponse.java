package ro.example.bankapi.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * RFC 7807 Problem Details error response.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Error response following RFC 7807 Problem Details")
public class ErrorResponse {
    
    @Schema(description = "Problem type URI", example = "https://example.com/problems/resource-not-found")
    private String type;
    
    @Schema(description = "Problem title", example = "Resource not found")
    private String title;
    
    @Schema(description = "HTTP status code", example = "404")
    private int status;
    
    @Schema(description = "Problem detail", example = "Transaction with ID 123 was not found")
    private String detail;
    
    @Schema(description = "Problem instance URI", example = "/api/v1/transactions/123")
    private String instance;
    
    @Schema(description = "Timestamp when error occurred")
    private LocalDateTime timestamp;
    
    @Schema(description = "Correlation/trace ID for debugging")
    private String traceId;
    
    @Schema(description = "Field validation errors")
    private Map<String, String> fieldErrors;
}
