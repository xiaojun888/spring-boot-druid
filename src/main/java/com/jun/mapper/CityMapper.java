package com.jun.mapper;

/**
 * Created by Administrator on 2018/2/8.
 */

import com.jun.domain.City;
import org.apache.ibatis.annotations.Param;


public interface CityMapper {

    /**
     *  /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */

    public City queryByName(@Param("cityName") String cityName);
}
