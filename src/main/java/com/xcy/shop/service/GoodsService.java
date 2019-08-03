package com.xcy.shop.service;

import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.pojo.GoodsType;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsByDongType(FenType goodsId);

    List<Goods> priceDesc(FenType dongId);

    List<Goods> salesDesc(FenType dongId);

    List<Goods> getGoodsByBrand(FenType dongId, Goods brandId);

    List<String> getBannerUrl();

    List<GoodsType> getGoodsTypeList();
}
