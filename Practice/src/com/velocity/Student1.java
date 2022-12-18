package com.velocity;

public class Student1 {

	public static void main(String[] args) {
		//write a program for below array to print element if sum of two element is 50
		int [] array = {10,30,20,40,50,60,60,40,30,50};
		
		for (int i=0;i<array.length;i++) {
			for(int a=i+1;a<array.length;a++) {
				
				if(array[i]+array[a]==50) {
					
					System.out.println("Two Elements are>>" +array[i]+" ,"+array[a]);
					
				}
			}
		}
		
	}

}
