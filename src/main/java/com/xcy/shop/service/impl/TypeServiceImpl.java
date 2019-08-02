package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.TypeMapper;
import com.xcy.shop.pojo.DongType;
import com.xcy.shop.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;
    @Override
    public List<DongType> dongTypeList() {

        return typeMapper.dongTypeList();
    }
}
