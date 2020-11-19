package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		int no4 = sc.nextInt();
		int no5 = sc.nextInt();
		
		int intArray[] = {no1, no2, no3, no4, no5};
		
		double avg=0;
		double sum=0;
		
		for(int i=0; i<intArray.length; i++) {
			
			sum+=intArray[i];
			avg=sum/intArray.length;
			
		}
		
		sc.close();
		
		System.out.println("평균은 " + avg + " 입니다.");
		
	}

}
