package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.GoodsMapper;
import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
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
}
