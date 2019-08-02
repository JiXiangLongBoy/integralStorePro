package com.xcy.shop.mapper;

import com.xcy.shop.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BrandMapper {
    List<Brand> brandList();
}
