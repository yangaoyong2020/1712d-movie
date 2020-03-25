package com.yay.domain;

public class NewsVO {

	private Integer g1;
	private String orderName;
	private String orderMethod;
	public Integer getG1() {
		return g1;
	}
	public void setG1(Integer g1) {
		this.g1 = g1;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public NewsVO(Integer g1, String orderName, String orderMethod) {
		super();
		this.g1 = g1;
		this.orderName = orderName;
		this.orderMethod = orderMethod;
	}
	public NewsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewsVO [g1=" + g1 + ", orderName=" + orderName + ", orderMethod=" + orderMethod + "]";
	}
	
}
