package Training.Training_04;

/*
 * Java 연습 문제 4
 * - 합계/평균 계산하기
 * - 사용자로부터 숫자를 입력받는다
 * - 입력 받은 숫자가 0 보다 클 경우 숫자를 누적 후 다시 입력을 받는다
 * - 입력 받은 숫자가 0 보다 작거나 같을 경우 입력을 종료한다
 * - 입력이 종료되면 입력 받은 숫자들의 합계와 평균을 출력한다
 *
 * Ex)
 * 1 번째 정수 입력 : 1
 * 2 번째 정수 입력 : 2
 * 3 번째 정수 입력 : 3
 * 4 번째 정수 입력 : 0
 *
 * 합계 : 6
 * 평균 : 2.0
 */

import java.util.Scanner;

public class CT01Training_04 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int nVal_Sum = 0;
		int nCount_Val = 0;
		
		do {
			System.out.printf("%d 번째 정수 입력 : ", nCount_Val + 1);
			int nVal = oScanner.nextInt();
			
			// 입력을 종료했을 경우
			if(nVal <= 0) {
				break;
			}
			
			nVal_Sum += nVal;
			nCount_Val += 1;
		} while(true);
		
		System.out.printf("\n합계 : %d\n", nVal_Sum);
		System.out.printf("평균 : %f\n", nVal_Sum / (float)nCount_Val);
	}
}
