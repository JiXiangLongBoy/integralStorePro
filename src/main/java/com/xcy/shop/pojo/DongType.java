package com.xcy.shop.pojo;

public class DongType {
    private Integer dongTypeId;
    private String typeName;

    @Override
    public String toString() {
        return "DongType{" +
                "dongTypeId=" + dongTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public Integer getDongTypeId() {
        return dongTypeId;
    }

    public void setDongTypeId(Integer dongTypeId) {
        this.dongTypeId = dongTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
