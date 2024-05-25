package com.truereality.onetomany;

import java.util.List;

/**
 * @author TrueReality
 * @date 2024/5/25
 * @apiNotes
 */
public class User {
    private Integer id;
    private String userName;
    private Integer userAge;
    private String userAddress;
    private List<Order> orderList;

    public User() {
    }

    public User(Integer id, String userName, Integer userAge, String userAddress, List<Order> orderList) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.orderList = orderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
