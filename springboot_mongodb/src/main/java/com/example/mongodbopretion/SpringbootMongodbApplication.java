package com.example.mongodbopretion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mongodbopretion.Repo.BankRepo;

@SpringBootApplication
public class SpringbootMongodbApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

}
