package pl.edu.wszib.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import pl.edu.wszib.springdemo.properties.CustomProperties;

@ConfigurationPropertiesScan
//@EnableConfigurationProperties(CustomProperties.class)
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
