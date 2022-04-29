package org.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



@Configuration
@ComponentScan(basePackages = "org.Assignment2")
public class AppConfig {

    @Bean
    @Primary
    public Address getAddress() {
        return new Address("Miami", "Florida", "USA", "33030");
    }

    @Bean

    public Phone getPhone() {
        return new Phone("555 555 5555");
    }

}


