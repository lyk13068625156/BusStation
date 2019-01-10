package org.gdou.busstation.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private String sex;
    private String pid;
    private Integer status;
    private String password;
    private String email;

    public User() {
    }

    public User(String id, String name, String sex, String pid, Integer status, String password, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.pid = pid;
        this.status = status;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pid='" + pid + '\'' +
                ", status=" + status +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
