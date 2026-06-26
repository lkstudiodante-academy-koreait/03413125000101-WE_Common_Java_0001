package Training.Training_11;

/*
 * Java 연습 문제 11
 * - 배열 요소 이동하기
 * - 길이가 5 인 배열을 생성 후 1 부터 차례대로 초기화한다
 * - 메뉴를 출력 후 사용자로부터 방향을 입력 받는다
 * - 입력받은 방향으로 배열의 요소를 이동 시킨 후 결과를 출력한다
 *
 * Ex)
 * ===== 배열 - 이동 전 =====
 * 1, 2, 3, 4, 5
 *
 * ===== 메뉴 =====
 * 1. 왼쪽으로 이동
 * 2. 오른쪽으로 이동
 *
 * Case 1. 왼쪽으로 이동
 * ===== 배열 - 이동 후 =====
 * 2, 3, 4, 5, 1
 *
 * Case 2. 오른쪽으로 이동
 * ===== 배열 - 이동 후 =====
 * 5, 1, 2, 3, 4
 */

import java.util.Scanner;

public class CT01Training_11 {
	/** 초기화 */
	public static void start(String[] args) {
		final int MENU_MOVE_LEFT = 1;
		final int MENU_MOVE_RIGHT = 2;
		
		Scanner oScanner = new Scanner(System.in);
		
		int[] oValues = {
				1, 2, 3, 4, 5
		};
		
		System.out.println("===== 배열 - 이동 전 =====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println("\n\n===== 메뉴 =====");
		System.out.println("1. 왼쪽으로 이동");
		System.out.println("2. 오른쪽으로 이동");
		
		System.out.print("\n선택 : ");
		int nMenu = oScanner.nextInt();
		
		switch(nMenu) {
			case MENU_MOVE_LEFT: {
				int nVal = oValues[0];
				
				for(int i = 0; i < oValues.length - 1; ++i) {
					oValues[i] = oValues[i + 1];
				}
				
				oValues[oValues.length - 1] = nVal;
				break;
			}
			case MENU_MOVE_RIGHT: {
				int nVal = oValues[oValues.length - 1];
			
				for(int i = oValues.length - 1; i > 0; --i) {
					oValues[i] = oValues[i - 1];
				}
				
				oValues[0] = nVal;
				break;
			}
		}
		
		System.out.println("\n===== 배열 - 이동 후 =====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println();
	}
}
