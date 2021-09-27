package com.kh.loop.test;

import java.util.Scanner;

public class D_BreakTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		// 문자열을 입력받아 
		// 글자 수를 출력하는 프로그램
		// 단, 'exit'가 입력되면 반복을 강제 종료
		
		String str = null;
		
		do {
			System.out.print("문자열 입력 : ");
		    str = sc.nextLine();
			
		    if(str.equals("exit")) {
		    	break;	// 반복문 강제종료
		    } else {
		    	System.out.println(">> 글자 수 : " + str.length());
		    }
		    
		} while (true); 
	
	}
	
	public void test2() {
		// continue
		// 정수 하나를 입력받아
		// 1부터 해당 정수까지의 짝수만 출력하기
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
	public void test3() {
		// jump / label 문법
		// 특정 반복문 위에 라벨을 명시하여 
		// 필요할 경우 해당 라벨이 적힌 반복문까지 
		// 뛰쳐 나갈 때 사용하는 문법
		
		prison: 	// 라벨:
			
		while(true) {
			int sum = 0;
			
			for(int i = 1; i <= 10000; i++ ) {
				
				sum += i;
				
				if( i == 5 ) {
					System.out.println("sum : " + sum);
					
					break prison; // break 라벨명: 
				}
			}
		}
	}
}
