package com.truereality.onetomany;

/**
 * @author TrueReality
 * @date 2024/5/25
 * @apiNotes
 */
public class Order {
    private Integer id;
    private String number;

    public Order() {
    }

    public Order(Integer id, String number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
