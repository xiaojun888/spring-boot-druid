package com.jun.controller;

import com.jun.domain.City;
import com.jun.service.ICityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/8.
 */
@RestController
@RequestMapping("city/")
public class CityController {

    private ICityService cityService;

    @RequestMapping(value = "query",method = RequestMethod.POST)
    public City findByName(String name){
        System.out.println(">>>>>>>>>>>name:"+name);
        return this.cityService.queryCityByName(name);
    }
}
