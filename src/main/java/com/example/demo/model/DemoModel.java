package com.example.demo.model;


import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DemoModel {

	@NotNull
	private String name;
}
