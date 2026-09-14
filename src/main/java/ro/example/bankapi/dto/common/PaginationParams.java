package ro.example.bankapi.dto.common;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaginationParams {
    
    @Parameter(description = "Page number (0-indexed)", example = "0")
    @Min(0)
    private Integer page = 0;
    
    @Parameter(description = "Page size", example = "50")
    @Min(1)
    @Max(100)
    private Integer size = 50;
    
    @Parameter(description = "Sort field and direction (field,asc|desc)", example = "createdAt,desc")
    private String sort = "createdAt,desc";
    
    public int getPage() {
        return page != null ? page : 0;
    }
    
    public int getSize() {
        return Math.min(Math.max(size != null ? size : 50, 1), 100);
    }
    
    public String getSort() {
        return sort != null ? sort : "createdAt,desc";
    }
}
