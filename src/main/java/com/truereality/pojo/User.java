package com.truereality.pojo;

/**
 * @author TrueReality
 * @date 2024/5/24
 * @apiNotes
 */
public class User {
    private Integer id;
    private String userName;
    private Integer userAge;
    private String userAddress;

    public User() {
    }

    public User(Integer id, String userName, Integer userAge, String userAddress) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
