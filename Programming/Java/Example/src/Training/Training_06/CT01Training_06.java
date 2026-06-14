package Training.Training_06;

/*
 * Java 연습 문제 6
 * - 구구단 출력하기
 * - 사용자로부터 정수 2 개를 입력 받는다
 * - 입력 받은 정수 중 작은 수부터 큰 수까지 해당하는 구구단을 출력한다
 * - 단, 수의 입력 순서는 상관 X
 *
 * Ex)
 * 정수 (2 개) 입력 : 4 2
 * ===== 2 단 =====
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * ...이하 생략
 *
 * ===== 3 단 =====
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * ...이하 생략
 *
 * ===== 4 단 =====
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * ...이하 생략
 */

import java.util.Scanner;

public class CT01Training_06 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (2 개) 입력 : ");
		
		int nVal_Min = oScanner.nextInt();
		int nVal_Max = oScanner.nextInt();
		
		// 값 보정이 필요 할 경우
		if(nVal_Min > nVal_Max) {
			int nTemp = nVal_Min;
			nVal_Min = nVal_Max;
			nVal_Max = nTemp;
		}
		
		for(int i = nVal_Min; i <= nVal_Max; ++i) {
			System.out.printf("===== %d 단 =====\n", i);
			
			for(int j = 1; j < 10; ++j) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			
			System.out.println();
		}
	}
}
