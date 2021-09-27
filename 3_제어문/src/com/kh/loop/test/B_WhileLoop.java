package com.kh.loop.test;

import java.util.Scanner;

public class B_WhileLoop {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// while 문은 별도의 초기식, 증감식 없이
		// 특정 조건만 반복하면 무한정 반복을 수행하는
		// 무한 반복의 특성을 지닌다.
		
		// while ( 조건식 ) {...}
		while (1 < 5) {
			System.out.println("ㅇㅇ 아 사랑해♥");
		}	
	}
	
	public void test2() {
		// 문자열을 하나 입력받아
		// 문자열의 길이만큼 문자 하나씩 분리하기
		// 안녕하세요 -> 안, 녕, 하. 세. 요
		
		// 안내 문구
		System.out.print("영단어 입력: ");
		String word = sc.next();
		
		int i =0;
		while(i<word.length()) {
			System.out.print(word.charAt(i) + ", ");
			i++;
		}
	}
	
	public void test3() {
		// 1부터 입력받은 수 까지의 합 계산하기
		int i = 0, sum = 0;
		int num = sc.nextInt();
		
		while(i<=num) {
			sum += i;
			i++;
			
		}
		System.out.println("입력받은 수 까지의 합: " + sum);
		// for (int i = 1; i <= num; i++) { . . . }
		// for( ; 1 < 5 ; ) // 무한반복(초기값과 증감값이 없으면 무한반복)
		
	}
	
	public void warmUp() {
				// 정수를 입력 받아 
				// 1부터 입력 받은 정수까지의 수를 홀수와 짝수로 구분하여
				// 홀수면 "당", 짝수면 "근"을 반복하여 출력 하되, 
				// for문과 while 문 두 가지 경우를 사용해 보시오.
				// 예) 4입력 : 
				//      당근당근
				//     5입력 :
				//      당근당근당
				// num % 2 == 0 (짝수)
	    System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for( int i = 1; i <= num ; i++) {
			if( i % 2 != 0) {
				System.out.print("당");
			} else {
				System.out.print("근");
			}
		}
			
		/*
		
	int i = 1;
	while ( i <= num ) {
		
		if( i % 2 != 0 ) {
			System.out.print("당");
		} else {
			System.out.print("근");
		}
		
		i++;

		// +a) 삼항 연산자를 사용할 경우
		// System.out.print( (i++ % 2 != 0) ? "당" : "근" );
		
  }
  */
 }

}