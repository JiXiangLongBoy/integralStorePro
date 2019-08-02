package com.xcy.shop.controller;

import com.xcy.shop.pojo.Goods;
import com.xcy.shop.pojo.Query;
import com.xcy.shop.service.GoodsTypeService;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typelist")
public class GoodsTypeController {

    @Autowired
    GoodsTypeService goodsTypeService;

    @RequestMapping("goodslistbygoodsid")
    public  List<Goods> goodsListByGoodsId(int typeId, @RequestParam(value = "size",defaultValue = "5",required = false)int size){


       List<Goods> goodsList = goodsTypeService.getGoodsListByGoodsTypeId(typeId,size);

        return goodsList;
    }

}
