package it.dstech.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDockerApplication.class, args);
	}

}
