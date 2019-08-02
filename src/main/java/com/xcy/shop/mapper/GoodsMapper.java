package com.xcy.shop.mapper;

import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    List<Goods> getGoodsByDongType(FenType dongId);
}
