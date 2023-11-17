package com.trigent.dhiraj;

public class Palindrome_No {

	public static void main(String[] args) {
		int number =747;
		int temp,sum=0;
		int reverse;
		
		temp=number;
		while(number>0) {
		reverse =number%10;
		sum=(sum*10)+reverse;
		number = number/10;
		
		}
		if(temp==sum) {
			System.out.println("The number is Palindrome " +sum );
		}
		else {
			System.out.println("Not Polindrome ");
		}
	}

	}


