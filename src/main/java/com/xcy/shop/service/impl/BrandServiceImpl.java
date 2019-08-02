package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.BrandMapper;
import com.xcy.shop.pojo.Brand;
import com.xcy.shop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandMapper brandMapper;
    @Override
    public List<Brand> brandList() {
        List<Brand> brandList = brandMapper.brandList();
        return brandList;
    }
}
