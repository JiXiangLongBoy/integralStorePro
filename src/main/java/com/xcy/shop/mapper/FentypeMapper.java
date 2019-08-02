package com.xcy.shop.mapper;

import com.xcy.shop.pojo.DongType;
import com.xcy.shop.pojo.FenType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FentypeMapper {
    List<FenType> fenTypeList(DongType dongTypeId);
}
