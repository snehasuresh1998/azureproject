package com.project.clinic.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.clinic.entity.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

}
