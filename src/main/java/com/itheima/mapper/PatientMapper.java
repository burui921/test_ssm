package com.itheima.mapper;

import com.itheima.domain.Patient;

import java.util.List;

public interface PatientMapper {
    List<Patient> findAll();

    void save(Patient patient);

    List<Patient> findByName(String paramName);
}
