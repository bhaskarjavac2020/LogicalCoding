package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PracticeForInteviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeForInteviewApplication.class, args);
	}

}
