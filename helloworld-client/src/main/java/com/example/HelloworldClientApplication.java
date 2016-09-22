package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.example.filters.pre.SimpleFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class HelloworldClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldClientApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}