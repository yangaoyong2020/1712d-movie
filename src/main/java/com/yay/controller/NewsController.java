package com.yay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yay.domain.NewsVO;
import com.yay.service.NewsService;
/**
 * 
 * @ClassName: NewsController 
 * @Description: TODO
 * @author: Administrator
 * @date: 2020年3月2日 下午2:55:50
 */
@Controller
public class NewsController {

	@Autowired
	private NewsService newsservice;
	
	@RequestMapping("goods")
	//@RequestParamm()
	public String list(Model m,NewsVO newsvo,Integer page,Integer pagesize){
		List<NewsVO> list = (List<NewsVO>) newsservice.list(newsvo, page, pagesize);
		//m.addAttribute("info",info);
		m.addAttribute("list",list);
		return "news";
	}
}
