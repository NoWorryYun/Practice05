package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {


		Friend[] friendArray = new Friend[3];	//배열 선언
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");
		for (int i = 0; i < friendArray.length; i++) {

			Friend friend = new Friend("이름", "핸드폰", "학교");	//생성자 선언

			System.out.print("이름: ");
			String name = sc.nextLine();
			friend.setName(name);

			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			friend.setHp(hp);

			System.out.print("학교: ");
			String school = sc.nextLine();
			friend.setSchool(school);
			
			friendArray[i] = friend;
			
			System.out.println("------------------------------");
		
		}	for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showInfo();	//배열[0][1][2]의 showInfo

			
		// 친구정보 출력 메소드 호출
		// 친구정보 3명 입력 로직 --> 반복문 사용
		// 친구정보 출력

		}

		sc.close();
	}
}
