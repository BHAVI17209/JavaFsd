package com.bhavitha.statistics;

public class Main {
	
	public static void main(String[] args) {
		
		KthSmallest ob = new KthSmallest(); 
		
        int arr[] = {13, 3, 58, 4, 19, 26}; 
        
        int left=0;//first index
        
        int n = arr.length;
        
        int right= n-1; //last index
        int k = 4; 
        
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, left, right, k)); 
    }

}
