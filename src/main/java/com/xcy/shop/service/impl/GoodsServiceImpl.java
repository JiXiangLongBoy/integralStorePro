package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.GoodsMapper;
import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.pojo.GoodsType;
import com.xcy.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsByDongType(FenType dongId) {
       List<Goods> goodsList= goodsMapper.getGoodsByDongType(dongId);
        return goodsList;
    }

    @Override
    public List<Goods> priceDesc(FenType dongId) {
        List<Goods> priceDescList = goodsMapper.priceDesc(dongId);
        return priceDescList;
    }

    @Override
    public List<Goods> salesDesc(FenType dongId) {
        List<Goods> salesDescList = goodsMapper.salesDesc(dongId);
        return salesDescList;
    }

    @Override
    public List<Goods> getGoodsByBrand(FenType dongId, Goods brandId) {
        List<Goods> brandGoodsList =goodsMapper.getGoodsByBrand(dongId,brandId);
        return brandGoodsList;
    }

    @Override
    public List<String> getBannerUrl() {

        return  goodsMapper.getBannerUrl();
    }

    @Override
    public List<GoodsType> getGoodsTypeList() {
        return goodsMapper.getGoodsTypeList();
    }
}
