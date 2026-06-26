package Training.Training_09;

/*
 * Java 연습 문제 9
 * - 합계/평균 계산하기
 * - 사용자로부터 숫자를 입력받는다
 * - 입력 받은 숫자가 0 보다 클 경우 해당 숫자를 배열에 저장 후 다시 숫자를 입력받는다
 * - 입력 받은 숫자가 0 보다 작거나 같을 경우 입력을 종료한다
 * - 입력이 종료 되면 사용자가 입력했던 숫자를 나열 후 합계/평균을 출력한다
 */

import java.util.Scanner;

public class CT01Training_09 {
	/** 초기화 */
	public static void start(String[] args) {
		int[] oValues = new int[5];
		Scanner oScanner = new Scanner(System.in);
		
		int nNumValues = 0;
		
		do
		{
			System.out.printf("%d 번째 정수 입력 : ", nNumValues + 1);
			int nVal = oScanner.nextInt();
			
			// 입력을 종료했을 경우
			if(nVal <= 0) {
				break;
			}
			
			// 배열이 가득찼을 경우
			if(nNumValues >= oValues.length) {
				int[] oValues_New = new int[nNumValues * 2];
				
				for(int i = 0; i < oValues.length; ++i) {
					oValues_New[i] = oValues[i];
				}
				
				oValues = oValues_New;
			}
			
			oValues[nNumValues++] = nVal;
		} while(true);
		
		System.out.println("\n===== 입력 된 숫자 =====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		int nVal_Sum = 0;
		float fVal_Average = 0.0f;
		
		for(int nVal : oValues) {
			nVal_Sum += nVal;
		}
		
		fVal_Average = nVal_Sum / (float)nNumValues;
		
		System.out.printf("\n\n합계 : %d\n", nVal_Sum);
		System.out.printf("평균 : %f\n", fVal_Average);
	}
}
