package Training.Training_19;

/*
 * Java 연습 문제 19
 * - 배열 치환하기
 * - 길이 15 배열을 생성 후 1 ~ 15 범위 수로 랜덤하게 초기화한다
 * - 사용자로부터 위치를 입력 받는다
 * - 입력 받은 위치를 기준으로 주변에 있는 1 자리수 수를 모두 -1 로 치환한다
 * - 단, 숫자 치환은 재귀 호출 활용
 *
 * Ex)
 * ===== 배열 - 치환 전 =====
 * 1, 2, 10, 5, 9, 8, 12, 15, 10, 3
 *
 * 위치 입력 : 3
 *
 * ===== 배열 - 치환 후 =====
 * 1, 2, 10, -1, -1, -1, 12, 15, 10, 3
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_19 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int[] oValues = new int[15];
		setupValues(oValues);
		
		System.out.println("===== 배열 - 치환 전 =====");
		printValues(oValues);
		
		System.out.print("\n위치 입력 : ");
		int nIdx = oScanner.nextInt();
		
		replaceValues(oValues, nIdx);
		
		System.out.println("\n===== 배열 - 치환 후 =====");
		printValues(oValues);
	}
	
	/** 값을 설정한다 */
	private static void setupValues(int[] a_oOutValues) {
		Random oRandom = new Random();
		
		for(int i = 0; i < a_oOutValues.length; ++i) {
			a_oOutValues[i] = oRandom.nextInt(1, 16);
		}
	}
	
	/** 값을 치환한다 */
	private static void replaceValues(int[] a_oValues, int a_nIdx) {
		boolean bIsValid = a_nIdx >= 0;
		bIsValid = bIsValid && a_nIdx < a_oValues.length;
		bIsValid = bIsValid && a_oValues[a_nIdx] >= 1;
		bIsValid = bIsValid && a_oValues[a_nIdx] <= 9;
		
		// 값 치환이 불가능 할 경우
		if(!bIsValid) {
			return;
		}
		
		a_oValues[a_nIdx] = -1;
		
		replaceValues(a_oValues, a_nIdx - 1);
		replaceValues(a_oValues, a_nIdx + 1);
	}
	
	/** 값을 출력한다 */
	private static void printValues(int[] a_oValues) {
		for(int i = 0; i < a_oValues.length; ++i) {
			System.out.printf("%d, ", a_oValues[i]);
		}
		
		System.out.println();
	}
}
