package com.cp.jworld;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cp.jworld.dao")
@EnableTransactionManagement
public class JworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(JworldApplication.class, args);
	}
}
