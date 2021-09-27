package com.kh.loop.test;

import java.util.Scanner;

public class E_MyLogic {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		/**
		   정수 하나를 입력받아
		   직각 삼각형을 다음과 같이 
		   출력 하시오.
		   입력 : 5

		   *
		   **
		   ***
		   ****
		   *****
		
		   hint : print / println 활용

		 */
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
	}
	
	public void test2() {
		/** 가로와 세로 길이를 정수로
	    각각 입력받아 직사각형을
	    * 로 출력 하시오
	    가로 : 5
	    세로 : 3
	
	    *****
	    *****
	    *****

	   hint : print / println 활용
	 */
		
		System.out.print("가로 : ");
		int width = sc.nextInt();
		
		System.out.print("세로 : ");
		int height = sc.nextInt();
		
		for(int i=0; i < height; i++) {
			for(int j=0; j< width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	// while문으로 작성(중첩) 
	/*
	 * System.out.print("가로 : ");
		int width = sc.nextInt();
		
		System.out.print("세로 : ");
		int height = sc.nextInt();
		
		int i = 1;
		while(i<=height) {
			int j = 1;
			while(j<=width) {
			if(j!=width) {
				System.out.print("*");
				} else {
					System.out.println("*");
					}
					j++;
				}
				i++;
		}
	}
	 */

	public void test3() {
		/** 
	    문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
			문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
			단, 영문자만 입력받도록 함.

		ex>
		문자열 입력 : application
		문자 입력 : p
		포함된 갯수 : 2 개
		====================
		문자열 입력 : apple_test123
		영문자가 아닙니다.
	 */
		// 강사님 코드
		/*
		 * boolean check = true; // 영문자 확인용 참 거짓 변수
		
		System.out.print("문자열 입력  : ");
		String str = sc.next();
		
		// 알파벳이 있는지 확인
		for(int i = 0; i < str.length() ; i++) {
			char alphabet = str.charAt(i);
			
			if((alphabet < 'A' || alphabet > 'Z') &&
				(alphabet < 'a' || alphabet > 'z')) {
				check = !check;
				break;
			}
			
			// 축약 형태 : 
			// if(!(check = (alphabet >= 'A' && alphabet <= 'Z') ||
			//              (alphabet >= 'a' && alphabet <= 'z'))) break;
		}
		
		if(check) {
			System.out.print("문자 하나 입력 : ");
			char ch = sc.next().charAt(0);
			
			int cnt = 0; // 문자 개수 체크용 변수
			
			for(int i = 0; i < str.length() ; i++) {
				if(str.charAt(i) == ch) cnt++;
			}
			
			System.out.printf("포함된 갯수 : %d 개\n", cnt);
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}
		 */
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		boolean isEng = false;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) > 64 && str.charAt(i) < 91) {
				isEng = true;
			} else if(str.charAt(i) > 96 && str.charAt(i) < 123){
				isEng = true;
			} else {
				isEng = false;
			}
		}
		
		if(isEng==false) {
			System.out.println("영문자가 아닙니다.");
		} else {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int count = 0;
			
			for (int i =0; i<str.length(); i++) {
				if(str.charAt(i) == ch) {
					count ++;
					
				}
			}
	
		
		System.out.println("포함된 갯수 : " + count);
		
		
		
		}
		
	}
}
