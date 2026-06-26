package Training.Training_13;

/*
 * Java 연습 문제 13
 * - 2 차원 배열 이동 시키기
 * - 길이가 3 x 3 인 2 차원 배열을 생성 후 1 부터 차례대로 초기화한다
 * - 메뉴를 출력 후 입력 받은 방향으로 2 차원 배열의 요소를 이동 시킨다
 *
 * Ex)
 * ===== 배열 - 이동 전 =====
 * 1, 2, 3
 * 4, 5, 6
 * 7, 8, 9
 *
 * ===== 메뉴 =====
 * 1. 위로 이동
 * 2. 아래로 이동
 * 3. 왼쪽으로 이동
 * 4. 오른쪽으로 이동
 *
 * Case 1. 위로 이동
 * ===== 배열 - 이동 후 =====
 * 4, 5, 6
 * 7, 8, 9
 * 1, 2, 3
 *
 * Case 2. 왼쪽으로 이동
 * ===== 배열 - 이동 후 =====
 * 2, 3, 1
 * 5, 6, 4
 * 8, 9, 7
 */

import java.util.Scanner;

public class CT01Training_13 {
	/** 초기화 */
	public static void start(String[] args) {
		final int MENU_MOVE_UP = 1;
		final int MENU_MOVE_DOWN = 2;
		final int MENU_MOVE_LEFT = 3;
		final int MENU_MOVE_RIGHT = 4;
		
		Scanner oScanner = new Scanner(System.in);
		
		int[][] oMatrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		System.out.println("===== 배열 - 이동 전 =====");
		
		for(int[] oValues : oMatrix) {
			for(int nVal : oValues) {
				System.out.printf("%d, ", nVal);
			}
			
			System.out.println();
		}
		
		System.out.println("\n===== 메뉴 =====");
		System.out.println("1. 위로 이동");
		System.out.println("2. 아래로 이동");
		System.out.println("3. 왼쪽으로 이동");
		System.out.println("4. 오른쪽으로 이동");
		
		System.out.print("\n선택 : ");
		int nMenu = oScanner.nextInt();
		
		switch(nMenu) {
			case MENU_MOVE_UP:
				for(int i = 0; i < oMatrix[0].length; ++i) {
					int nVal = oMatrix[0][i];
					
					for(int j = 0; j < oMatrix.length - 1; ++j) {
						oMatrix[j][i] = oMatrix[j + 1][i];
					}
					
					oMatrix[oMatrix.length - 1][i] = nVal;
				}
				
				break;
			
			case MENU_MOVE_DOWN:
				for(int i = 0; i < oMatrix[0].length; ++i) {
					int nVal = oMatrix[oMatrix.length - 1][i];
					
					for(int j = oMatrix[i].length - 1; j > 0; --j) {
						oMatrix[j][i] = oMatrix[j - 1][i];
					}
					
					oMatrix[0][i] = nVal;
				}
				
				break;
			
			case MENU_MOVE_LEFT:
				for(int i = 0; i < oMatrix.length; ++i) {
					int nVal = oMatrix[i][0];
					
					for(int j = 0; j < oMatrix[i].length - 1; ++j) {
						oMatrix[i][j] = oMatrix[i][j + 1];
					}
					
					oMatrix[i][oMatrix[i].length - 1] = nVal;
				}
				
				break;
			
			case MENU_MOVE_RIGHT:
				for(int i = 0; i < oMatrix.length; ++i) {
					int nVal = oMatrix[i][oMatrix[i].length - 1];
					
					for(int j = oMatrix[i].length - 1; j > 0; --j) {
						oMatrix[i][j] = oMatrix[i][j - 1];
					}
					
					oMatrix[i][0] = nVal;
				}
				
				break;
		}
		
		System.out.println("\n===== 배열 - 이동 후 =====");
		
		for(int[] oValues : oMatrix) {
			for(int nVal : oValues) {
				System.out.printf("%d, ", nVal);
			}
			
			System.out.println();
		}
	}
}
