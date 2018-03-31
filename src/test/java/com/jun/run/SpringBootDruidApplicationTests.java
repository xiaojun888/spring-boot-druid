package com.jun.run;

import com.jun.service.ICityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.jun.mapper")
public class SpringBootDruidApplicationTests {

	@Autowired
	private ICityService cityService;
	@Test
	public void contextLoads() {

		System.out.println(cityService.queryCityByName("潍坊市"));


	}

}
