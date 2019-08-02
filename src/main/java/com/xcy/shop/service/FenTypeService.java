package com.xcy.shop.service;

import com.xcy.shop.pojo.DongType;
import com.xcy.shop.pojo.FenType;

import java.util.List;

public interface FenTypeService {
    List<FenType> fenTypeList(DongType dongTypeId);
}
