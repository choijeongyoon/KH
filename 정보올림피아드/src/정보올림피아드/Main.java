package 정보올림피아드;

import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
     
        int n = sc.nextInt();	// 정수 n 입력
        int m = sc.nextInt();	// 정수 m 입력
     
		if (n % 2 == 0 || 0 > n || 100 < n || m < 0 || m > 4) {

			System.out.println("INPUT ERROR!");

			return;

		}
		
		switch(m) {
		case 1 :
			for(int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		
		}
		
      }
}