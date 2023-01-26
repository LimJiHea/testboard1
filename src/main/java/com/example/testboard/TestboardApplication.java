package com.example.testboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.testboard")
public class TestboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestboardApplication.class, args);
	}

}
