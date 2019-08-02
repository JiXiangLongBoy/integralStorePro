package com.xcy.shop.controller;

import com.xcy.shop.pojo.DongType;
import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.service.FenTypeService;
import com.xcy.shop.service.GoodsService;
import com.xcy.shop.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    @Autowired
    TypeService typeService;
    @Autowired
    FenTypeService fenTypeService;
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/dongTypeList")
    public List<DongType> dongTypeList(){
        List<DongType> dongTypeList=typeService.dongTypeList();
        return dongTypeList;
    }
    @RequestMapping("/fenTypeList")
    public List<FenType> fenTypeList(DongType dongTypeId){
        List<FenType> fenTypeList = fenTypeService.fenTypeList(dongTypeId);
        return fenTypeList;
    }
    @RequestMapping("/getGoodsByDongType")
    public List<Goods> getGoodsByDongType(FenType dongId){
        List<Goods> goodsList = goodsService.getGoodsByDongType(dongId);
        return goodsList;
    }
}
