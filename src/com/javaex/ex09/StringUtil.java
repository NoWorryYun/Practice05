package com.javaex.ex09;

public class StringUtil {
    //필드
	//생성자
	//GS
	
	
	//일반
    public static String concatString(String[] strArray){
    	
    	String hero = strArray[0];
    	//메소드 내용작성
    	for(int i = 1 ; i < strArray.length ; i++) {
    		hero = hero + strArray[i];
    	}
    	return hero;
    }

}
