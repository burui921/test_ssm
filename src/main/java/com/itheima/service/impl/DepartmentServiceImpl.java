package com.itheima.service.impl;

import com.itheima.domain.Department;
import com.itheima.domain.Patient;
import com.itheima.mapper.DepartmentMapper;
import com.itheima.mapper.PatientMapper;
import com.itheima.service.DepartmentService;
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
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();

    }
}
