package io.membrane_api.jmediator_spring_boot_starter;


import io.membrane_api.jmediator.*;
import org.slf4j.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

@Configuration
@ConditionalOnClass(JMediator.class)
public class JMediatorAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(JMediatorAutoConfiguration.class);

    @Bean
    @ConditionalOnMissingBean
    public JMediator mediator(ApplicationContext ctx) {
        log.info("Creating JMediator");
        JMediator jMediator = new JMediator();
        jMediator.setApplicationContext(ctx);
        return jMediator;
    }
}
