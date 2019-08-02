package com.xcy.shop.pojo;

public class Query {

    private int TypeId;
    private int size;

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
   }

    @Override
    public String toString() {
        return "Query{" +
                "TypeId=" + TypeId +
                ", size=" + size +
                '}';
    }
}
