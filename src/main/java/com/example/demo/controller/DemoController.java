package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.DemoRepository;

@CrossOrigin
@RestController
public class DemoController {

	@Autowired
	DemoRepository demoRepository;

	@PostMapping(value = "/events/dl/update/")
	public Object update(Object userevent) {
		return demoRepository.save(userevent);

	}

}
