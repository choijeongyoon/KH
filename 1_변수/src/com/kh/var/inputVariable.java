package com.kh.var;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputVariable {
	// 입출력 기능 제공 메소드 활용하기
	/*
		// java 1.5 버전 (라떼는...)
		public void inputMethod() {
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("숫자 입력 : ");
			
			try {
				String value = rd.readLine();
				
				int result = Integer.parseInt(value);
				
				System.out.println("입력하신 숫자는 " + result +" 입니다.");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	*/
	
	public void myInputMethod() {
		// 실습 1.
		// 기본 자료형 3가지 이상을 사용하여
		// 도서의 정보를 입력받는 프로그램을 만들어 보자!
		// 단, Scanner를 사용하고, 변수의 이름은 성의있게
		// 직접 지어서 사용해보기
		
		String bookTitle;
		int bookPrice;
		double discount;
		boolean stock;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("도서 가격 : ");
		bookPrice = sc.nextInt();
		
	    sc.nextLine();
		System.out.print("도서 명 : ");
		bookTitle = sc.nextLine();
		
		System.out.print("도서 할인율 : ");
		discount = sc.nextDouble();
		
		System.out.print("도서 재고 유무 : ");
		stock = sc.nextBoolean();
		
		System.out.println("--------------------------");
		
		// 1 번 방법
		System.out.println("도서 명 : " + bookTitle);
		System.out.printf("도서 가격 : %d\n", bookPrice);
		System.out.printf("도서 할인율 : %.3f%% \n", discount);
		System.out.printf("도서 재고 유무 : %b \n", stock);
		
		// 2번 방법
	//	System.out.printf("도서 명 : %s\n도서 가격 : %d\n도서 할인율 : %.3f\n도서 재고 유무 : %b", 
			//	bookTitle, bookPrice, discount, stock);
		
	}
	
}	


