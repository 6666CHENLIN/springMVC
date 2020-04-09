package com.gm.bean;

import java.util.List;

/**
 * @author 陈琳
 * @date 2020/3/31 14:33
 */
public class Student {
    private int id;
    private String username;
    private String password;
    private List<String> sex;


    public Student() {
    }

    public Student(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public List<String> getSex() {
        return sex;
    }

    public void setSex(List<String> sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
