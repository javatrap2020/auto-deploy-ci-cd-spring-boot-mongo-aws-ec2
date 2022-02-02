package com.javatrap2020.patient.service.impl;

import com.javatrap2020.patient.model.Patient;
import com.javatrap2020.patient.repository.PatientRepository;
import com.javatrap2020.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientImpl implements PatientService {

    @Autowired
    private PatientRepository repositoryRepository;

    @Override
    public List<Patient> getAllPatients() {
        return repositoryRepository.findAll();
    }
}
