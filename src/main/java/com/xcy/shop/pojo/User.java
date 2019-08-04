package com.xcy.shop.pojo;

public class User {

    private int userId;
    private String userName;
    private String passWord;
    private String  city;
    private String estaurantName;
    private String consignee;
    private String phone;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", city='" + city + '\'' +
                ", estaurantName='" + estaurantName + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User( String userName, String passWord, String city, String estaurantName, String consignee, String phone, String address) {

        this.userName = userName;
        this.passWord = passWord;
        this.city = city;
        this.estaurantName = estaurantName;
        this.consignee = consignee;
        this.phone = phone;
        this.address = address;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEstaurantName() {
        return estaurantName;
    }

    public void setEstaurantName(String estaurantName) {
        this.estaurantName = estaurantName;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
