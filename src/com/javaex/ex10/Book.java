package com.javaex.ex10;

public class Book {
    
    //필드
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	//생성자
	public Book() {}
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	//GS
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getStateCode() {
		return stateCode;
	}
	
	//일반
    public void rent() {
    	if(this.stateCode == 0) {
    		this.stateCode = this.stateCode + 1;
    		System.out.println(title + "(이)가 반납되었습니다.");    	//전체를 반복해야 사용가능
    	} else if(this.stateCode == 1) {
    		this.stateCode = this.stateCode - 1;
    		System.out.println(title + "(이)가 대여 되었습니다.");
    	}
    }
    
    public void print() {
    	if (stateCode == 1) {
    		System.out.println(bookNo + ", 책 제목:" + title + ", 작가: " + author + ", 대여 유무 : 재고있음");
    	} else if(stateCode == 0) {
    		System.out.println(bookNo + ", 책 제목:" + title + ", 작가: " + author + ", 대여 유무 : 대여중");
    	}
    }
    
}
