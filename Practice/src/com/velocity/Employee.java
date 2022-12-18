package com.velocity;

public class Employee {

	public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int count=10;
	int n3 ;
	
	for(int i=1;i<=count;i++) {
		n3=n1+n2;
		System.out.println("The series is ="+n3);
		
		n1=n2;
		n2=n3;
	}

	}

}
