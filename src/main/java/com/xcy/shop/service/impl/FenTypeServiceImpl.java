package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.FentypeMapper;
import com.xcy.shop.pojo.DongType;
import com.xcy.shop.pojo.FenType;
import com.xcy.shop.service.FenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FenTypeServiceImpl implements FenTypeService {
    @Autowired
    FentypeMapper fentypeMapper;
    @Override
    public List<FenType> fenTypeList(DongType dongTypeId) {
        List<FenType> fenTypeList =fentypeMapper.fenTypeList(dongTypeId);
        return fenTypeList;
    }
}
