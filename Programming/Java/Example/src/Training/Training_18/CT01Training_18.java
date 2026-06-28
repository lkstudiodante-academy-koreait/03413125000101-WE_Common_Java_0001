package Training.Training_18;

/*
 * Java 연습 문제 18
 * - 10 진수를 2 진수로 변환하기
 * - 사용자로부터 10 진수 정수를 입력받는다
 * - 사용자가 입력 한 수를 2 진수로 변환해서 출력한다
 * - 단, 2 진수 변환은 재귀 호출 활용
 */

import java.util.Scanner;

public class CT01Training_18 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nVal = oScanner.nextInt();
		
		String oStr_Binary = convertDecimal_ToBinary(nVal);
		System.out.printf("결과 : %s\n", oStr_Binary);
	}
	
	/** 10 진수 -> 2 진수로 변환한다 */
	private static String convertDecimal_ToBinary(int a_nVal) {
		// 재귀 호출이 종료 되었을 경우
		if(a_nVal <= 0) {
			return "";
		}
		
		String oResult = convertDecimal_ToBinary(a_nVal / 2);
		oResult += String.format("%d", a_nVal % 2);
		
		return oResult;
	}
}
