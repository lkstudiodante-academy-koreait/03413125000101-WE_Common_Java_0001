package Training.Training_20;

/*
 * Java 연습 문제 20
 * - 하노이 탑 시뮬레이션 출력하기
 * - 사용자로부터 원반 번호를 입력받는다
 * - 입력받은 원반을 목적지로 이동하기 위한 과정을 출력한다
 *
 * Ex)
 * 원반 번호 입력 : 3
 * 1 번 원반 : A -> C 로 이동
 * 2 번 원반 : A -> B 로 이동
 * 1 번 원반 : C -> B 로 이동
 * 3 번 원반 : A -> C 로 이동
 * 1 번 원반 : B -> A 로 이동
 * 2 번 원반 : B -> C 로 이동
 * 1 번 원반 : A -> C 로 이동
 */

import java.util.Scanner;

public class CT01Training_20 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("원반 번호 입력 : ");
		int nNumber = oScanner.nextInt();
		
		printResult_HanoiTower(nNumber, "A", "C", "B");
	}
	
	/** 하노이 탑 결과를 출력한다 */
	private static void printResult_HanoiTower(int a_nNumber, String a_oFrom, String a_oTo, String a_oBuffer) {
		// 결과 출력이 불가능 할 경우
		if(a_nNumber <= 0) {
			return;
		}
		
		printResult_HanoiTower(a_nNumber - 1, a_oFrom, a_oBuffer, a_oTo);
		System.out.printf("%d 번 원반 : %s -> %s 로 이동\n", a_nNumber, a_oFrom, a_oTo);
		
		printResult_HanoiTower(a_nNumber - 1, a_oBuffer, a_oTo, a_oFrom);
	}
}
