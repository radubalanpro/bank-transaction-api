package ro.example.bankapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditEvent {
    private Long id;
    private Long userId;
    private String eventType;
    private String resourceType;
    private Long resourceId;
    private String httpMethod;
    private String endpoint;
    private Integer statusCode;
    private String ipAddress;
    private String userAgent;
    private String correlationId;
    private Map<String, Object> metadata;
    private LocalDateTime createdAt;
}
