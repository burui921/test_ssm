package com.itheima.service.impl;

import com.itheima.domain.Patient;
import com.itheima.mapper.PatientMapper;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.itheima.service.impl
 * @ClassName: PatientServiceImpl
 * @Author: burui
 * @Date: 2019/11/27 9:43
 * @Description: //TODO
 */
@Service("patientService")
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<Patient> findAll() {
        return patientMapper.findAll();
    }

    @Override
    public void save(Patient patient) {
        patientMapper.save(patient);
    }

    @Override
    public List<Patient> findByName(String name) {
        String paramName ="";
        if(name != null && name.length()>0){
            paramName = "%"+name+"%";
        }
        return patientMapper.findByName(paramName);
    }
}
