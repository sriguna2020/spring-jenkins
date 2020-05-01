package com.sriguna.jenkins.springjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		System.out.println("***********Application started******");
	}

	public static void main(String[] args) {
		System.out.println("*********Application executed*****");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
