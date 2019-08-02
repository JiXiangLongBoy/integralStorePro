package com.xcy.shop.service;

import com.xcy.shop.pojo.Goods;
import com.xcy.shop.pojo.Query;

import java.util.List;

public interface GoodsTypeService {
    List<Goods> getGoodsListByGoodsTypeId(int typeId, int size);
}
