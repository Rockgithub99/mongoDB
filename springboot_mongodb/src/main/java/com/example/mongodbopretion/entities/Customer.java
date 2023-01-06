package com.example.mongodbopretion.entities;

import org.springframework.data.mongodb.core.mapping.MongoId;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Customer {
	
	@MongoId
	private String CustId;
	private String  CustName;
	private String email;
	private Long accountNo;

}
