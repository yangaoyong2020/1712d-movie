package com.yay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yay.dao.NewsDao;
import com.yay.domain.News;
import com.yay.domain.NewsVO;
import com.yay.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsdao;
	@Override
	public int insert(List<News> news) {
		
		return newsdao.insert(news);
	}
	@Override
	public PageInfo<News> list(NewsVO newsvo, Integer page, Integer pagesize) {
		PageHelper.startPage(page, pagesize);
		List<NewsVO> li = newsdao.list(newsvo);
		return new PageInfo<News>();
	}
	
	

}
