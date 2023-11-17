package com.trigent;
import java.util.Arrays;
public class SmallArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {11,54,65,13,10,5,8,75};
		
//		int small1=Integer.MAX_VALUE;
//		int small2=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//		if(arr[i]<small1) {
//			small2 = small1;
//			small1= arr[i];
//			}
//		else {
//			if(arr[i]<small2 && arr[i]!=small1) {
//				small2 =arr[i];
//				}
//		}
//		}
//		System.out.println(small2);
//		
//		
//	}
		
		
				Arrays.sort(arr);

		        // Using Stream API to find the second smallest element
		        int secondSmallest = Arrays.stream(arr)
		                .distinct() // Remove duplicates, if any
		                .skip(1) // Skip the first element (smallest)
		                .findFirst() // Find the second smallest
		                .orElse(-1); // If array has less than 2 unique elements, return -1 or handle accordingly

		        if (secondSmallest != -1) {
		            System.out.println("Second smallest element in the array: " + secondSmallest);
		        } else {
		            System.out.println("Array has less than 2 unique elements.");
		        }
		        
		        
		    }
		


}

