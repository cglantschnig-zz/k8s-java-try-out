package com.glantschnig.kubernetestest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class KubernetesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesTestApplication.class, args);
	}

	@PostConstruct
	public void printEnvironment() {
		System.getenv()
				.entrySet()
				.stream()
				.forEach(map -> System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue()));
	}
}
