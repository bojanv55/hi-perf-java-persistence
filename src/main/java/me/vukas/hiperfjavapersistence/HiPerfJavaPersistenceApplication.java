package me.vukas.hiperfjavapersistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@EnableJpaRepositories("me.vukas.hiperfjavapersistence.repository.jpa")
@EnableMapRepositories("me.vukas.hiperfjavapersistence.repository.map")
@SpringBootApplication
public class HiPerfJavaPersistenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiPerfJavaPersistenceApplication.class, args);
	}

}
