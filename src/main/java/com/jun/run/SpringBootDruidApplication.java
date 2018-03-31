package com.jun.run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jun.mapper")
public class SpringBootDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDruidApplication.class, args);
	}
}
