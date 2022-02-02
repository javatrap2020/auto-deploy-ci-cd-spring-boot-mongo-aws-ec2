package com.javatrap2020.patient.repository;

import com.javatrap2020.patient.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, Long> {
}
