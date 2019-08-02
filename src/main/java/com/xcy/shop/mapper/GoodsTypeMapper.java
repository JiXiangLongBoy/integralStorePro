package com.xcy.shop.mapper;

import com.xcy.shop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsTypeMapper {
    List<Goods> getGoodsListByGoodsTypeId(int typeId,int size);

}
