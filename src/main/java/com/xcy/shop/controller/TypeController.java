package com.xcy.shop.controller;

import com.xcy.shop.pojo.Brand;
import com.xcy.shop.pojo.DongType;
import com.xcy.shop.pojo.FenType;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.service.BrandService;
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
    @Autowired
    BrandService brandService;


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
    @RequestMapping("/priceDesc")
    public List<Goods> priceDesc(FenType dongId){
       List<Goods> priceDescList= goodsService.priceDesc(dongId);
       return priceDescList;
    }
    @RequestMapping("/salesDesc")
    public List<Goods> salesDesc(FenType dongId){
        List<Goods> salesDescList= goodsService.salesDesc(dongId);
        return salesDescList;
    }
    @RequestMapping("/brandList")
    public List<Brand> brandList(){
       List<Brand> brandList= brandService.brandList();
       return brandList;
    }
    @RequestMapping("/getGoodsByBrand")
    public List<Goods> getGoodsByBrand(FenType dongId,Goods brandId){
        List<Goods> brandGoodsList=goodsService.getGoodsByBrand(dongId,brandId);
        return brandGoodsList;
    }
}
