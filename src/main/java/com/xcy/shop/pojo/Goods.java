package com.xcy.shop.pojo;

import java.util.Date;

public class Goods {

    private Integer goodsId;

    private String goodsName;

    private Integer price;

    private Integer discount;

    private Integer typeId;

    private Integer sales;

    private Date time;

    private String standrd;

    private String weight;

    private String pack;

    private String endTime;

    private String brand;

    private Integer goodsNum;

    private Integer statusId;

    private Integer dongType;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStandrd() {
        return standrd;
    }

    public void setStandrd(String standrd) {
        this.standrd = standrd;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getDongType() {
        return dongType;
    }

    public void setDongType(Integer dongType) {
        this.dongType = dongType;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", typeId=" + typeId +
                ", sales=" + sales +
                ", time=" + time +
                ", standrd='" + standrd + '\'' +
                ", weight='" + weight + '\'' +
                ", pack='" + pack + '\'' +
                ", endTime='" + endTime + '\'' +
                ", brand='" + brand + '\'' +
                ", goodsNum=" + goodsNum +
                ", statusId=" + statusId +
                ", dongType=" + dongType +
                '}';
    }
}
