package com.hzit.mySsm1.service.impl;

import com.hzit.mySsm1.mapper.IndexMapper;
import com.hzit.mySsm1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    private IndexMapper indexMapper;


    @Override
    public String query() {


        return indexMapper.queryName();
    }
}
