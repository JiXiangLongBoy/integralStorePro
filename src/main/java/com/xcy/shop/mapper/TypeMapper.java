package com.xcy.shop.mapper;

import com.xcy.shop.pojo.DongType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    List<DongType> dongTypeList();
}
