package com.xcy.shop.pojo;

public class FenType {

    private Integer dongId;
    private Integer goodsId;
    private String dongName;
    private Integer dongTypeId;

    @Override
    public String toString() {
        return "FenType{" +
                "dongId=" + dongId +
                ", goodsId=" + goodsId +
                ", dongName='" + dongName + '\'' +
                ", dongTypeId=" + dongTypeId +
                '}';
    }

    public Integer getDongId() {
        return dongId;
    }

    public void setDongId(Integer dongId) {
        this.dongId = dongId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getDongName() {
        return dongName;
    }

    public void setDongName(String dongName) {
        this.dongName = dongName;
    }

    public Integer getDongTypeId() {
        return dongTypeId;
    }

    public void setDongTypeId(Integer dongTypeId) {
        this.dongTypeId = dongTypeId;
    }
}
