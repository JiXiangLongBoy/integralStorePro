package com.xcy.shop.pojo;

public class GoodsType {

private int id;
private String typeName;
private String typeImgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeImgUrl() {
        return typeImgUrl;
    }

    public void setTypeImgUrl(String typeImgUrl) {
        this.typeImgUrl = typeImgUrl;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", typeImgUrl='" + typeImgUrl + '\'' +
                '}';
    }
}
