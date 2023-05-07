package com.application.MongoDB.Application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.application.MongoDB.Application.entity.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String>{

}
