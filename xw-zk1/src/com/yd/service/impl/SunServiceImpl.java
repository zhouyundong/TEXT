package com.yd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yd.Mapper.SunMapper;
import com.yd.pojo.Sun;
import com.yd.service.SunService;

@Service
public class SunServiceImpl implements SunService {
	
	@Autowired
	private SunMapper sm;

	@Override
	public List<Sun> findAll(String titile) {
		return sm.findAll(titile);
	}


	@Override
	public void del(Integer id) {
		sm.del(id);
	}

	@Override
	public Sun toedit(Integer id) {
		return sm.toedit(id);
	}

	@Override
	public void add(String titile, String coo, String data) {
		  sm.add(titile,coo,data);
	}

	@Override
	public void update(Integer id, String titile, String coo, String data) {
	   sm.update(id,titile,coo,data);
	}
	
	

}
