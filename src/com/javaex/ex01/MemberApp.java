package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member();
		
		jws.setId("jws");
		jws.setName("정우성");
		jws.setPoint(50000);
		
		jws.showInfo();
		
		Member yjs = new Member();
		
		yjs.setId("yjs");
		yjs.setName("유재석");
		yjs.setPoint(30000);
		
		yjs.showInfo();
		
		Member lhr = new Member();
		
		lhr.setId("lhr");
		lhr.setName("이효리");
		lhr.setPoint(40000);
		
		lhr.showInfo();
	}
	

}
