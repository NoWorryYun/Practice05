package com.javaex.ex04;

public class Base {

	// 필드

	// 생성자

	// GS

	// 메소드
	public void service(String state) {
		if (state == "낮") {
			System.out.println("낮에는 열심히 수업듣자");
		} else if (state == "밤") {
			System.out.println("밤에는 숙면");
		} else if (state == "오후") {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}
	}
}
