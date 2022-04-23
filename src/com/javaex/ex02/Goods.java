package com.javaex.ex02;

public class Goods {
	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// GS
	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// 일반
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}

}
