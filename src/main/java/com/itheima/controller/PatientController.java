package com.itheima.controller;

import com.itheima.domain.Patient;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @PackageName: com.itheima.controller
 * @ClassName: PatientController
 * @Author: burui
 * @Date: 2019/11/27 9:42
 * @Description: //TODO
 */
@Controller
@RequestMapping("/test")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Patient> patientList = patientService.findAll();
        model.addAttribute("patientList",patientList);
        return "patients-list";
    }
    @RequestMapping("/findByName")
    public String findByName(Model model,String name){
        List<Patient> patientList = patientService.findByName(name);
        model.addAttribute("patientList",patientList);
        return "patients-list";
    }

    @RequestMapping("/save")
    public String save(Patient patient, HttpServletRequest request){
        patientService.save(patient);
        return "redirect:"+request.getContextPath()+"/test/findAll";
    }
}
