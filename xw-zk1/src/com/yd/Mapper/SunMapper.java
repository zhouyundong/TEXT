package com.yd.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yd.pojo.Sun;

public interface SunMapper {

	List<Sun> findAll(@Param("titile")String titile);

	void del(Integer id);

	Sun toedit(Integer id);

	void add(@Param("titile")String titile, @Param("roo")String coo, @Param("data")String data);

	void update(@Param("id")Integer id,@Param("titile")String titile, @Param("roo")String coo, @Param("data")String data);

}
