package com.xcy.shop.service;

import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsByDongType(FenType goodsId);
}
