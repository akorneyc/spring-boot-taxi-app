package io.akorneyc.taxidiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaxiDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxiDiscoveryServerApplication.class, args);
	}

}
