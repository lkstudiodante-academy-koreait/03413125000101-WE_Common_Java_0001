package Training.Training_08;

/*
 * Java 연습 문제 8
 * - 구구단 출력하기
 * - 사용자로부터 정수 1 개를 입력받는다
 * - 입력 받은 정수만큼 한 라인에 구구단을 출력합니다
 *
 * Ex)
 * 정수 입력 : 3
 * 2 * 1 = 2		3 * 1 = 3		4 * 1 = 4
 * 2 * 2 = 4		3 * 2 = 6		4 * 2 = 8
 * 2 * 3 = 6		3 * 3 = 9		4 * 3 = 12
 * ...이하 생략
 *
 * 5 * 1 = 5		6 * 1 = 6		7 * 1 = 7
 * 5 * 2 = 10		6 * 2 = 12		7 * 2 = 14
 * 5 * 3 = 15		6 * 3 = 18		7 * 3 = 21
 * ...이하 생략
 *
 * 8 * 1 = 8		9 * 1 = 9
 * 8 * 2 = 16		9 * 2 = 18
 * 8 * 3 = 24		9 * 3 = 27
 * ...이하 생략
 */

import java.util.Scanner;

public class CT01Training_08 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nNumber = oScanner.nextInt();
		
		for(int i = 2; i < 10; i += nNumber) {
			for(int j = 1; j < 10; ++j) {
				for(int k = 0; k < nNumber; ++k) {
					// 구구단 출력이 불가능 할 경우
					if(i + k >= 10) {
						continue;
					}
					
					System.out.printf("%d * %d = %d\t", i + k, j, (i + k) * j);
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
