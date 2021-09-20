package 정올;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        if(n % 2 == 0 || n < 2 || n > 100) {
        	System.out.println("INPUT ERROR!");
        }
         
        int x = 1;	// 첫 행 1로 초기화
        int y = n / 2 + 1;	// 열 초기값 중앙으로
        
        
        int[][] arr = new int[100][100];
        
        for(int i = 1; i <= n * n; i++) {
        	
        	arr[x][y] = i;
        	
        	if(i % n == 0) {
        		x++;
        	} else {
        		x--;	// 왼쪽 위로 이동
        		y--; 	// 왼쪽 위로 이동
        		
        		if(x < 1) x = n;	// x위치가 범위 벗어나면 n으로 이동
        		if(y < 1) y = n; 	// y위치가 범위 벗어나면 n으로 이동
        		
        	}
        }
        
        // 출력
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= n; j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
       
    }
}