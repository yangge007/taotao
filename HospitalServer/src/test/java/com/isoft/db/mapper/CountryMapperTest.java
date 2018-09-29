package com.isoft.db.mapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext-mybatis.xml"})
public class CountryMapperTest {
	
	@Autowired
//	private CountryMapper mapper;
	
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test() {
//		Country country=mapper.selectByPrimaryKey((short) 1);
		
//		System.out.println(country.getCountry());
	}

}
