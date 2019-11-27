package com.itheima.mapper;

import com.itheima.domain.Department;
import com.itheima.domain.Patient;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findAll();

    @Select("select * from department where id=#{did}")
    Department findById(Integer did);
}
