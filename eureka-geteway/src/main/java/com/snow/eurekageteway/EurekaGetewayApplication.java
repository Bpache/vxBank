package com.snow.eurekageteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class EurekaGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGetewayApplication.class, args);
    }

    @Component
    @Configuration
    public class GateWayCorsConfig
    {
        @Bean
        public CorsFilter corsFilter() {
            final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            final CorsConfiguration corsConfiguration = new CorsConfiguration();
            corsConfiguration.setAllowCredentials(true);
            corsConfiguration.addAllowedHeader("*");
            corsConfiguration.addAllowedOrigin("*");
            corsConfiguration.addAllowedMethod("*");
            source.registerCorsConfiguration("/**", corsConfiguration);
            return new CorsFilter(source);
        }
    }

}
