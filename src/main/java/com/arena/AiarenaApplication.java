package com.arena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arena.model.Arena;

@SpringBootApplication
public class AiarenaApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(AiarenaApplication.class, args);
		Arena arena = new Arena();
		arena.play();
	}
}
