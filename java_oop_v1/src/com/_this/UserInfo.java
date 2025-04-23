package com._this;

import java.util.IdentityHashMap;

/**
 * this. 문법 왜 사용하는가
 * this() 문법 왜 사용하는가
 */

public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    // 생성자 매개변수 1개 ~ 5개 즉, 생성자 5개 만들어 주세요 (생성자 오버로딩)

    public UserInfo(String userId) {
        this.userId = userId;
    }

    public UserInfo(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;
    }

    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        this.userAddress = userAddress;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this(userId, userPassword, userName, userAddress);
        this.phoneNumber = phoneNumber;
    }

    // getter 메서드 만들어 주세요
    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // setter 메서드 만들어 주세요
    public void setUserId(String i) {
        userId = i;
    }

    public void setUserPassword(String p) {
        userPassword = p;
    }

    public void setUserName(String n) {
        userName = n;

    }

    public void setUserAddress(String a) {
        userAddress = a;
    }

    public void setPhoneNumber(String t) {
        phoneNumber = t;
    }


}
