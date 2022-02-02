package com.javatrap2020.patient;

import com.javatrap2020.patient.model.Patient;
import com.javatrap2020.patient.repository.PatientRepository;
import com.javatrap2020.patient.utils.HelperUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class PatientServiceApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);

    }

    @Autowired
    private PatientRepository patientRepository;

    @Bean
    CommandLineRunner runner() {
        return args -> {
            List<Patient> patients = patientRepository.findAll();
            if (patients.size() == 0) {
                logger.info("Inserting student data to DB");

            } else {
                logger.info("Patient data stored in total:: {} and Data :: {}");
            }
        };
    }

}
