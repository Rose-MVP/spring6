package com.powernode.spring6.beans;

public class User {
    private int age;//int 是简单类型
    private String username;//string too
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {

        this.age = age;
    }

}
