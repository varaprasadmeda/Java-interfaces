package com.java.interfaces;

public class BankingClient {

	public static void main(String[] args) {
        Bank obj;
        obj= new SBI();
        System.out.println("Rate of Intrest is SBI :"+obj.rateOfIntrest()+"%");
        
        obj = new UnionBank();
        System.out.println("Rate of Intrest is Union :"+obj.rateOfIntrest()+"%");

	}

}
