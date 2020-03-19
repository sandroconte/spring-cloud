package it.dstech.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service1DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service1DockerApplication.class, args);
	}

}
