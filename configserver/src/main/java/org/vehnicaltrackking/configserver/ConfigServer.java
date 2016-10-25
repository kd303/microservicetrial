package org.vehnicaltrackking.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	public static void main(String []s) {
		System.out.println("************************************command line*****************");
		System.out.printf("proxy yser name : %s", System.getProperty("https.proxyUser"));
		System.out.println("************************************command line*****************");
		SpringApplication.run(ConfigServer.class, s);
	}
}
