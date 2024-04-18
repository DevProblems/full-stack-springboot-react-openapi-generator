package com.devproblems.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "DevProblems Youtube Video API",
        description = "All API definitions for DevProblems Youtube Videos",
        version = "1.0.2"), servers = {
        @Server(url = "http://localhost:8081/",
                description = "local server")
})
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
