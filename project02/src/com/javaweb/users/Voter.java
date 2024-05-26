package com.javaweb.users;

public class Voter { //投票人
    private String name;//姓名
    private String username;//账号
    private String password;//密码

    public Voter(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Voter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
