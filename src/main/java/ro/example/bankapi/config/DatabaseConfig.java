package ro.example.bankapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

/**
 * Database configuration with HikariCP connection pooling.
 * 
 * HikariCP is included automatically with spring-boot-starter-jdbc
 * and is configured via application.yml properties.
 * 
 * Configuration:
 * - maximum-pool-size: 20 (max concurrent connections)
 * - minimum-idle: 5 (min idle connections in pool)
 * - connection-timeout: 30s (wait time for connection from pool)
 * - idle-timeout: 10min (how long idle connection stays before closed)
 * - max-lifetime: 30min (max lifetime of any connection)
 * 
 * These settings are optimized for:
 * - High concurrent transaction processing
 * - Preventing connection exhaustion
 * - Detecting stale connections
 * - Handling multiple client instances
 */
@Configuration
public class DatabaseConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
