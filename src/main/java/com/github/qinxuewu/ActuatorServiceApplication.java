package com.github.qinxuewu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author chen
 */
@SpringBootApplication
public class ActuatorServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ActuatorServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ActuatorServiceApplication.class, args);
    }
}
