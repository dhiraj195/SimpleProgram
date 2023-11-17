package com.trigent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
	public static void main(String[]args) {
		int arr[] = {7,2,1,9,23,15,8};
		
		Arrays.sort(arr);
		
		System.out.println("Sort array "+Arrays.toString(arr));
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.print(arr[i]+",");
		}
		
		
	}
}
