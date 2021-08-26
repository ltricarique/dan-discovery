package ar.edu.utn.frsf.isi.dan.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DanDiscoveryApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DanDiscoveryApplication.class, args);
	}
}
