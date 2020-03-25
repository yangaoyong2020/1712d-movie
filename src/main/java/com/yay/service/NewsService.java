package com.yay.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yay.domain.News;
import com.yay.domain.NewsVO;

public interface NewsService {
	int insert(List<News> news);
	 PageInfo<News> list(NewsVO newsvo,Integer page,Integer pagesize);
}
