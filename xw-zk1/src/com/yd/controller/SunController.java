package com.yd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yd.pojo.Sun;
import com.yd.service.SunService;

@Controller
public class SunController {
	
	@Autowired
	private SunService ss;
	
	@RequestMapping("/")
	public ModelAndView show(ModelAndView mv){	
		mv.setViewName("redirect:list");
		return mv;
	}
	
	@RequestMapping("/list")
	public ModelAndView findAll(ModelAndView mv,String titile){
		 List<Sun> list=ss.findAll(titile);
		 mv.addObject("list", list);
		mv.setViewName("sunlist");
		return mv;
	}
	
	@RequestMapping("/toadd")
	public ModelAndView toadd(ModelAndView mv){		
		mv.setViewName("add");
		return mv;
	}
	@RequestMapping("/toedit")
	public ModelAndView toedit(ModelAndView mv,Integer id){	
		Sun sun=ss.toedit(id);
		System.out.println(sun.getData());
		mv.addObject("sun", sun);
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("/add")
	public ModelAndView add(ModelAndView mv,String titile,String roo,String data){	
		
		ss.add(titile,roo,data);
		mv.setViewName("redirect:list");
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv,Integer id,String titile,String roo,String data){	
		  ss.update(id,titile,roo,data);
		mv.setViewName("redirect:list");
		return mv;
	}
	@RequestMapping("/del")
	public ModelAndView delete(ModelAndView mv,Integer id){	
		  ss.del(id);
		mv.setViewName("redirect:list");
		return mv;
	}

}
