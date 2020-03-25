package com.yay.service.impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysql.jdbc.StringUtils;
import com.yay.domain.News;
import com.yay.service.NewsService;
import com.yay.utils.StreamUtil;
import com.yay.utils.StringUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class NewsServiceImplTest {

	@Autowired
	private NewsService newsservice;
	@Test
	public void testInsert() throws IOException {
		//创建一个news对象 用于储存
		List<News> news = new ArrayList<News>();
		//读取文件里面的内容 
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/date.txt"));
		for (String str : list) {
			News n = new News();
			//分割
			String[] s = str.split("\\");
			String id0=s[0];
			//isNumber()，该方法是判断参数是否为数字
			if(StringUtil.isNumber(id0)){
				n.setId(Integer.valueOf(id0));
			}
			//hasText()，该方法是过滤String参数空格后判断是否有值
			String title1=s[1];
			if(StringUtil.hasText(title1)){
				n.setTitle(title1);
			}
			news.add(n);
		}
		newsservice.insert(news);
	}

}
