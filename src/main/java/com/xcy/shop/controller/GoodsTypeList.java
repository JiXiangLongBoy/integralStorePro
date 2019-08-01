package com.xcy.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/typelist")
public class GoodsTypeList {

    @RequestMapping("goodstypelist")
    @ResponseBody
    public String goodsTypeList(int typeId){
        System.out.println(typeId+"~~");
        return "666";
    }

}
