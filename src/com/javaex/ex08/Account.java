package com.javaex.ex08;

public class Account {

	//필드
    private String accountNo;
    private int balance;
    private int money;
    
    //생성자 작성
    public Account() {}
    public Account(String accountNo) {
    	this.accountNo = accountNo;
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
	public int deposit(int money) {
		money = this.money + money;
		return money;
	}
	
	public int withdraw(int money) {
		money = this.money - money;
		return money;
	}
	
	public void showBalance() {
	}
	
}
