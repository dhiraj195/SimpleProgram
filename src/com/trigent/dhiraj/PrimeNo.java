package com.trigent.dhiraj;

import java.util.stream.IntStream;

public class PrimeNo {

	public static void main(String[] args) {

		int numberToCheck = 46;
		
		
		boolean isPrime = IntStream.range(2, numberToCheck).noneMatch(i -> numberToCheck % i == 0);
		if(isPrime) {
			System.out.println("The number "+numberToCheck+ " is prime");
		}
		else {
			System.out.println("The number is "+numberToCheck+" is not prime");
		}
		

		System.out.println(numberToCheck + " is " + (IntStream.range(2, numberToCheck).noneMatch(i -> numberToCheck % i == 0) ? "prime number" : "not prime numbeer"));

	}

}
