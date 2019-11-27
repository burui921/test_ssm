package com.itheima.service;

import com.itheima.domain.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> findAll();

    void save(Patient patient);

    List<Patient> findByName(String name);
}
