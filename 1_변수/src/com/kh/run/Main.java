package com.kh.run;

// 다른 패키지의 클래스를 추가할 때 사용
// .* 해당 패키지의 모든 클래스를 임포트 할 수 있다.
// Ctrl + Shift + '0'

import com.kh.var.*;

// 작성한 내용 저장 : Ctrl + s
// 모든 파일 내용 저장 : Ctrl + Shift + s

public class Main {

	public static void main(String[] args) {
		// 실행 전용 메소드
		
		//new TestVariable1().method1();
		//new TestVariable1().method2();
		//new TestVariable2().method1();
		//new TestVariable2().method2();
		//new TestVariable2().method3();
		//new TestVariable2().method4( 10000 ); // 전달 인자(args : arguments)
	    //new CastingTest().castMethod1();
		//new CastingTest().castMethod2();
		//new inputVariable().inputMethod2();
		new inputVariable().myInputMethod();
	}
	
}
