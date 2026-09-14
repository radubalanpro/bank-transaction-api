package ro.example.bankapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IdempotencyKey {
    private Long id;
    private Long userId;
    private String idempotencyKey;
    private String requestHash;
    private Integer responseStatus;
    private String responseBody;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
}
