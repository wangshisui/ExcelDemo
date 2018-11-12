package com.zyx.exceldemo;

/**
 * @Author:zhangyx
 * @Date:Created in 21:032018/11/12
 * @Modified By:
 */
public class User {
    private String userName;
    private String password;

    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
