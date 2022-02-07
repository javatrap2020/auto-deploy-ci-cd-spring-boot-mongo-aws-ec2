package com.javatrap2020.patient.utils;

import com.javatrap2020.patient.model.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class HelperUtil {

    private HelperUtil() {

    }

    public static Supplier<List<Patient>> patientDataSupplier = () ->
            Arrays.asList(
                    Patient.builder().name("Patient1-1").email("javatrap@java.com").build(),
                    Patient.builder().name("Patient2").email("javatrap2@java.com").build(),
                    Patient.builder().name("Patient3").email("javatrap3@java.com").build(),
                    Patient.builder().name("Patient4").email("javatrap4@java.com").build(),
                    Patient.builder().name("Patient5").email("javatrap5@java.com").build()
            );
}
