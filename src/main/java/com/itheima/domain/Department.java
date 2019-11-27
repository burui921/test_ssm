package com.itheima.domain;

/**
 * @PackageName: com.itheima.domain
 * @ClassName: Department
 * @Author: burui
 * @Date: 2019/11/27 9:39
 * @Description: //TODO
 */

public class Department {
    private  Integer  id ;
    private  String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
