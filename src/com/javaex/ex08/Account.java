package com.javaex.ex08;

public class Account {

	//필드
    private String accountNo;
    private int balance;
    private int deposit;
    private int withdraw;
    
    //생성자 작성
    public Account() {}
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    public Account(String accountNo, int balance) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    }
    
    //GS
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}

    //필요한 메소드 작성
	public void deposit(int deposit) {
		this.balance = this.balance + deposit;
	}
	
	public void withdraw(int withdraw) {
		this.balance = this.balance - withdraw;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	
}
