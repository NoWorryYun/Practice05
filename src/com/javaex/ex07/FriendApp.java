package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend friend = new Friend("이름", "핸드폰", "학교");

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		while (true) {
			for (int i = 0; i < friendArray.length; i++) {
				System.out.print("이름: ");
				String name = sc.nextLine();
				friend.setName(name);

				System.out.print("핸드폰: ");
				String hp = sc.nextLine();
				friend.setHp(hp);

				System.out.print("학교: ");
				String school = sc.nextLine();
				friend.setSchool(school);
				System.out.println("------------------------------");
			}

			// 친구정보 3명 입력 로직 --> 반복문 사용

			// 친구정보 출력
			for (int i = 0; i < friendArray.length; i++) {
				friend.showInfo();
				// 친구정보 출력 메소드 호출
			}

			sc.close();
		}
	}
}
