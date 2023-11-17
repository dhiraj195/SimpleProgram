package com.trigent;

public class RotateArray {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int n = 3; // Number of times to rotate

	        System.out.println("Array before left rotation:");
	        printArray(arr);

	        // Left rotate the array by 'n' positions
	        for (int i = 0; i < n; i++) {
	            int temp = arr[0];
	            for (int j = 0; j < arr.length - 1; j++) {
	                arr[j] = arr[j + 1];
	            }
	            arr[arr.length - 1] = temp;
	        }

	        System.out.println("\nArray after left rotation by " + n + " positions:");
	        printArray(arr);
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    

	    //Traverse the array
	   
	}

}
