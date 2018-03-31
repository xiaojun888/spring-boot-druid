package com.jun.service.impl;

import com.jun.domain.City;
import com.jun.mapper.CityMapper;
import com.jun.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/8.
 */
@Service
public class CityServiceImpl implements ICityService {
   @Autowired
   private CityMapper cityMapper;

    @Override
    public City queryCityByName(String cityName) {
        return this.cityMapper.queryByName(cityName);
    }
}
