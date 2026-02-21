package egovframework.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@Configuration
@EnableJdbcHttpSession(maxInactiveIntervalInSeconds = 1800)
public class SessionConfig {
    // DataSource와 TransactionManager는 
    // 이미 XML 설정에 등록되어 자동 주입됩니다.
}
