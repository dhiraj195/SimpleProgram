package com.trigent;

public class FindElements {

	
	    public static void main(String[] args) {
	        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};

	        // Array to keep track of elements that are visited
	        boolean[] visited = new boolean[arr.length];

	        System.out.println("Element : Frequency");
	        for (int i = 0; i < arr.length; i++) {
	            if (!visited[i]) {
	                int count = 1;
	                for (int j = i + 1; j < arr.length; j++) {
	                    if (arr[i] == arr[j]) {
	                        visited[j] = true;
	                        count++;
	                    }
	                }
	                if (!visited[i]) {
	                    visited[i] = true;
	                    System.out.println(arr[i] + " : " + count);
	                }
	            }
	        }
	    }
	}


