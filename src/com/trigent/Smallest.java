package com.trigent;

import java.util.Arrays;
//find the second smallest array
public class Smallest {

	
	public static void main(String[] args) {
		int [] arr = {11,54,65,13,10,5,8,75};
		Arrays.sort(arr);
		int secondSmallest ;
		
				if(arr.length<2) {
					System.out.println("no number");
					return;
				}
				else {
					int index =1;
					while(index<arr.length && arr[index] == arr[0]) {
						index++;
					}
					if(index<arr.length) {
						secondSmallest = arr[index];
						System.out.println("smallest num is "+secondSmallest);
					}
					else {
						System.out.println("No sammlest num");
					}
				}
			}
		
	
}
