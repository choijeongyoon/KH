package com.kh.loop.test;

import java.util.Scanner;

public class A_ForLoop {
	// 반복문
	// 어떠한 계산, 출력을 연달아 수행할 경우
	// 컴퓨터를 통해 반복하도록 만드는 문법
	
	// 1. For : 반복 횟수에 제한을 두는 반복문
	// 2. While : 반복 횟수에 제한이 없는 반복문
	// 3. do-while : 조건에 만족하지 않더라도 반드시 1번은 수행하는 반복문
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 1 ~ 10 까지의 합 구하기
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("반복 확인 : " + i);
			
			sum += i;
			
		}
		System.err.println("sum : " + sum);
	}
	
	public void test2() {
		// 단순 반복
		// 1 ~ 100까지 중 짝수들의 합
	
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}
		
			
		}
		
		System.out.println("sum1 : " + sum1);
		
		// 거꾸로 반복하기
		// 5 ~ 1 
		
		for(int i = 5; i >= 1; i--) {
			System.out.println("i : " + i);
		}
	}
	
	public void test3() {
		// 정수 하나를 입력하여
		// 1부터 해당 수까지의 합을
		// 구하시오.
		// for( 시작값 ; 어디까지 조건 ; 카운트 ) { . . . }
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt(), sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void test4() {
		// 구구단
		// 2단
		// 2 * 1 =2
		// 2 * 2 =4
		// . . .
		
		for (int i = 1; i <= 9; i++) {
				System.out.println(" 2 * " + i + " = " + 2 * i);
				// System.out.printf(" 2 * %d \n", i, ( 2 * i ));
		}
	}
		
	public void silsub() {
		// 1에서 6까지 주사위 임의의 수(랜덤한 수) 3번을 반복해서
		// 구한뒤 각각의 값과 합계를 출력하는 코드를 작성 하시오.
		// ---------------
		// 주사위 : 3
		// 주사위 : 4
		// 주사위 : 1
		// 합계 : 8
		// ---------------
		
		
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			int num =  (int) (Math.random() * 6 + 1);
			System.out.println("주사위 : " + num);
			sum += num;
		}
		System.out.println("합계 : " + sum);	
		
	}
	

	public void test5() {
		// 1부터 100까지 중 3의배수의 개수를 구하시오.
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				count++;
			}
		
		}
		System.out.println("3의 배수의 개수 : " + count );
	}
	public void test6() {
		// 중첩 반복문
		// 구구단 2 ~ 9 단
		
		for( int i = 2; i <= 9; i++) {
			// 2 ~ 9 까지 반복
			
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("----------------------------");
		}
	}
}

