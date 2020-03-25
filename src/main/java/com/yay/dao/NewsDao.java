package com.yay.dao;

import java.util.List;

import com.yay.domain.News;
import com.yay.domain.NewsVO;

public interface NewsDao {
   int insert(List<News> news);
   List<NewsVO> list(NewsVO newsvo);
}
