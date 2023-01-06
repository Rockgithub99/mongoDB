package com.example.mongodbopretion.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.example.mongodbopretion.entities.Bank;


public interface BankRepo extends MongoRepository<Bank ,String> {

	

}
