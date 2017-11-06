package com.yd.service;

import java.util.List;

import com.yd.pojo.Sun;

public interface SunService {

	List<Sun> findAll(String titile);
	void del(Integer id);

	Sun toedit(Integer id);

	void add(String titile, String coo, String data);
	void update(Integer id, String titile, String coo, String data);

}
