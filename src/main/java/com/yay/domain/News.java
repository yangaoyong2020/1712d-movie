package com.yay.domain;

import java.util.Date;

public class News {

	private Integer id;
	private String title;
	private String url;
	private Integer score;
	private Date created;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public News(Integer id, String title, String url, Integer score, Date created) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.score = score;
		this.created = created;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", url=" + url + ", score=" + score + ", created=" + created
				+ "]";
	}
	public String[] spilt(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
