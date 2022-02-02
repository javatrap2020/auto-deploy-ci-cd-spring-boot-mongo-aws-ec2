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
                    Patient.builder().name("Patient1").build(),
                    Patient.builder().name("Patient2").build(),
                    Patient.builder().name("Patient3").build()
            );
}
