package com.itheima.service;

import com.itheima.domain.Department;
import com.itheima.domain.Patient;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
}
