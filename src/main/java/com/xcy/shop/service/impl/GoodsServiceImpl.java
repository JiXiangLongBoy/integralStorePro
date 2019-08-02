package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.GoodsTypeMapper;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsTypeService {


    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<Goods> getGoodsListByGoodsTypeId(int typeId,int size) {
        return goodsTypeMapper.getGoodsListByGoodsTypeId(typeId,size);
    }
}
