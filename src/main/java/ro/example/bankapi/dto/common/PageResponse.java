package ro.example.bankapi.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Generic paginated response wrapper.
 */
@Data
@Builder
@Schema(description = "Paginated response")
public class PageResponse<T> {
    
    @JsonProperty("content")
    @Schema(description = "Page content")
    private List<T> content;
    
    @JsonProperty("page")
    @Schema(description = "Current page number (0-indexed)")
    private int page;
    
    @JsonProperty("size")
    @Schema(description = "Page size")
    private int size;
    
    @JsonProperty("totalElements")
    @Schema(description = "Total number of elements")
    private long totalElements;
    
    @JsonProperty("totalPages")
    @Schema(description = "Total number of pages")
    private int totalPages;
    
    @JsonProperty("first")
    @Schema(description = "Whether this is the first page")
    private boolean first;
    
    @JsonProperty("last")
    @Schema(description = "Whether this is the last page")
    private boolean last;
}
