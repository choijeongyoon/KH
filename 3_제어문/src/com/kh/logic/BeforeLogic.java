package com.kh.logic;

public class BeforeLogic {

	public static void main(String[] args) {
		// 조건문은 어떠한 연산의 결과가 참이냐 거짓이냐에 따라 
		// 수행하는 코드를 선택할 수 있다.
		
		int min = 10, max = 99;
		double mass = 10.0;
		boolean check = false;
		char ch = 'a';
		
		// ------------------------- //
		// 위의 변수 5개를 활용하여
		// 비교연산자와 일반 논리 연산자를 적절히
		// 섞어 true/ false 결과를 각각 10개 씩 만들어보기
		
		// -- true 10 개
		System.out.println("true 결과 : " + (min == mass && max > ch));
		System.out.println("true 결과 : " + (min < max || min == mass));
		System.out.println("true 결과 : " + (min == mass && max > min));
		System.out.println("true 결과 : " + (ch != max && min != max));
		System.out.println("true 결과 : " + (min < max || ch < max));
		System.out.println("true 결과 : " + (mass < ch && min == mass));
		System.out.println("true 결과 : " + (min <= ch || max > ch));
		System.out.println("true 결과 : " + (min < max || min != mass));
		System.out.println("true 결과 : " + (ch != max || mass == min));
		System.out.println("true 결과 : " + (max >= mass && min != ch));
		
		
		
		// -- false 10개 
		System.out.println("false 결과 : " + (min > max && ch < min));
		System.out.println("false 결과 : " + (min == max || ch < min));
		System.out.println("false 결과 : " + (min != max && ch < mass));
		System.out.println("false 결과 : " + (min == max && ch == min));
		System.out.println("false 결과 : " + (max == mass && ch == mass));
		System.out.println("false 결과 : " + (min != mass && ch > max));
		System.out.println("false 결과 : " + (max <= min && mass >= min));
		System.out.println("false 결과 : " + (mass != min || max == ch));
		System.out.println("false 결과 : " + (min > mass && ch <= min));
		System.out.println("false 결과 : " + (ch >= max && min <= max));
		
	}

}
