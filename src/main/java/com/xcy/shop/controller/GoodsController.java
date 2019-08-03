package com.xcy.shop.controller;

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
    public String showIndex(Model model){

       List<String> indexBanner = goodsService.getBannerUrl();

       List<GoodsType> goodsTypeList = goodsService.getGoodsTypeList();

       model.addAttribute("indexBanner",indexBanner);
       model.addAttribute("goodsTypeList",goodsTypeList);
       System.out.println(goodsTypeList);
       return "index";
   }

}
