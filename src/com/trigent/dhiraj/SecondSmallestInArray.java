package com.trigent.dhiraj;

import java.util.stream.IntStream;

public class SecondSmallestInArray {

	 public static int getSecondSmallest(int[] a) {

	        return IntStream.of(a).sorted().distinct().skip(1).findFirst().orElse(0);
	    }

	    public static void main(String[] args) {

	        int[] a = {11, 24, 6, 8, 3, 35, 65, 76};

	        System.out.println("Second smallest element in the array is: " + getSecondSmallest(a));
	    }
}
