package com.itheima.domain;

/**
 * @PackageName: com.itheima.domain
 * @ClassName: Patient
 * @Author: burui
 * @Date: 2019/11/27 9:41
 * @Description: //TODO
 */

public class Patient {
    private  Integer  id ;
    private  String  name ;
    private  Integer  gender;
    private  Integer  did;
    private  String  content;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", content='" + content + '\'' +
                '}';
    }
}
