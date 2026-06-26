package Training.Training_10;

/*
 * Java 연습 문제 10
 * - 홀수/짝수 나열하기
 * - 사용자로부터 배열의 길이를 입력 받은 후 해당 길이의 배열을 생성한다
 * - 배열의 길이만큼 사용자로부터 정수를 입력받는다
 * - 입력받은 정수가 홀수 일 경우 왼쪽에서 오른쪽 방향으로 배열에 할당한다
 * - 입력받은 정수가 짝수 일 경우 오른쪽에서 왼쪽 방향으로 배열에 할당한다
 *
 * Ex)
 * 길이 입력 : 5
 * 1 번째 정수 입력 : 1
 * 2 번째 정수 입력 : 2
 * 3 번째 정수 입력 : 3
 * 4 번째 정수 입력 : 4
 * 5 번째 정수 입력 : 5
 *
 * ===== 입력 된 정수 =====
 * 1, 3, 5, 4, 2
 */

import java.util.Scanner;

public class CT01Training_10 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("길이 입력 : ");
		
		int nSize = oScanner.nextInt();
		int[] oValues = new int[nSize];
		
		int nLeft = 0;
		int nRight = nSize - 1;
		
		for(int i = 0; i < nSize; ++i) {
			System.out.printf("%d 번째 정수 입력 : ", i + 1);
			int nVal = oScanner.nextInt();
			
			// 홀수 일 경우
			if(nVal % 2 != 0) {
				oValues[nLeft++] = nVal;
			} else {
				oValues[nRight--] = nVal;
			}
		}
		
		System.out.println("\n===== 입력 된 정수 =====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println();
	}
}
