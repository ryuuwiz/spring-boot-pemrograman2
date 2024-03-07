package com.kelompok6.latihan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LatihanApplication {
	public static void main(String[] args) {
		SpringApplication.run(LatihanApplication.class, args);
	}

}
