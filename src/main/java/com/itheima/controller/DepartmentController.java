package com.itheima.controller;

import com.itheima.domain.Department;
import com.itheima.domain.Patient;
import com.itheima.service.DepartmentService;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName: com.itheima.controller
 * @ClassName: PatientController
 * @Author: burui
 * @Date: 2019/11/27 9:42
 * @Description: //TODO
 */
@Controller
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/findDept")
    @ResponseBody
    public List<Department> findAll(){
        return departmentService.findAll();
    }
}
