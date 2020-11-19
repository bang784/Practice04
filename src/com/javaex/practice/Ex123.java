package com.javaex.practice;

public class Ex123 {

	public static void main(String[] args) {
		
		
		//로또번호 자동생성기 배열사용
		int[] lottoNums = new int[6];
		
		System.out.println(lottoNums.length);
		
		for(int i=0; i<=lottoNums.length; i++) {
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		
		//lottoNums.length --> 배열의 갯수 --> 6
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]); //i 0~5
		}

		
		//ArrayIndexOutofBoundsException --> lottoNums[6]
		for(int i=0; i<=lottoNums.length; i++) {
			System.out.println(lottoNums[i]); //i 0~5
		}
		
		
	}

}
