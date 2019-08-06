package com.xcy.shop.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xcy.shop.pojo.Goods;
import com.xcy.shop.pojo.GoodsType;
import com.xcy.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/showindex")
    public String showIndex(Model model) {

        List<String> indexBanner = goodsService.getBannerUrl();

        List<GoodsType> goodsTypeList = goodsService.getGoodsTypeList();

        List<Goods> goodsList = goodsService.getHotsellGoods();

        List<Goods> goodsTimeList = goodsService.getGoodsByTime();
        List<Goods> goodsDiscountList = goodsService.getGoodsByDiscount();


        model.addAttribute("indexBanner", indexBanner);
        model.addAttribute("goodsTypeList", goodsTypeList);
        model.addAttribute("goodsList", goodsList);
        model.addAttribute("goodsTimeList", goodsTimeList);
        model.addAttribute("goodsDiscountList", goodsDiscountList);
        return "index";
    }

    @RequestMapping("/showproduct")
    public String showProduct(Model model, int id) {
        Goods goods = goodsService.getGoodsById(id);
        model.addAttribute("goods", goods);
        return "product";
    }

    @RequestMapping("/productlist")
    public String productList(Model model,int typeId){

        return "product_list";
    }


}
