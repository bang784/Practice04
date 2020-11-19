package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
	
		
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', '1'};

		
		for(int i=0; i<c.length; i++) {
		
		System.out.print(c[i]);
		
		}
	
		System.out.println();
		
		for(int j=0; j<c.length; j++) {
			
			if(c[j]==' ') {c[j]=',';}
			
			System.out.print(c[j]);
			
		}
		
	}
	

}
