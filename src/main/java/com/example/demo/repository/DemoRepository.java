package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.DemoModel;

@Service
@Repository
@Qualifier("auditorRepository")
public interface DemoRepository extends MongoRepository<Object, Long> {

	
	
}
