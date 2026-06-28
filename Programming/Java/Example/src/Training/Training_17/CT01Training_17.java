package Training.Training_17;

/*
 * Java 연습 문제 17
 * - 행맨 게임 제작하기
 * - 정해진 단어 중 하나를 랜덤하게 추출한다
 * - 추출 된 단어를 구성하고 있는 문자 중 일부를 제외한 나머지는 비활성한다
 * - 사용자로부터 문자를 입력 받아 해당 문자가 단어에 존재 할 경우 문자를 활성한다
 * - 모든 문자가 활성 되면 게임을 종료한다
 * - 단, 대/소문자 구분 X
 *
 * Ex)
 * 정답 : Google
 *
 * _ _ o _ l _
 * 문자 입력 : G
 *
 * G _ o g l _
 * 문자 입력 : o
 *
 * G o o g l _
 * 문자 입력 : e
 *
 * G o o g l e
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_17 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		String oAnswer = getAnswer();
		System.out.printf("정답 : %s\n\n", oAnswer);
		
		char[] oLetters = getLetters(oAnswer);
		
		do {
			printLetters(oLetters);
			
			System.out.print("문자 입력 : ");
			String oLetter = oScanner.nextLine();
			
			for(int i = 0; i < oLetters.length; ++i) {
				char chLetter = Character.toUpperCase(oLetter.charAt(0));
				char chLetter_Answer = Character.toUpperCase(oAnswer.charAt(i));
				
				// 문자가 존재 할 경우
				if(chLetter == chLetter_Answer) {
					oLetters[i] = oAnswer.charAt(i);
				}
			}
			
			System.out.println();
		} while(!isAnswer(oLetters));
		
		printLetters(oLetters);
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 정답 여부를 검사한다 */
	private static boolean isAnswer(char[] a_oLetters) {
		for(int i = 0; i < a_oLetters.length; ++i) {
			// 가려진 문자 일 경우
			if(a_oLetters[i] == '_') {
				return false;
			}
		}
		
		return true;
	}
	
	/** 정답을 반환한다 */
	private static String getAnswer() {
		Random oRandom = new Random();
		
		String[] oWords = {
				"Apple",
				"Google",
				"Samsung",
				"Microsoft"
		};
		
		int nIdx = oRandom.nextInt(0, oWords.length);
		return oWords[nIdx];
	}
	
	/** 문자를 반환한다 */
	private static char[] getLetters(String a_oAnswer) {
		Random oRandom = new Random();
		char[] oLetters = a_oAnswer.toCharArray();
		
		for(int i = 0; i < oLetters.length; ++i) {
			oLetters[i] = '_';
		}
		
		for(int i = 0; i < oLetters.length / 3; ++i) {
			int nIdx = oRandom.nextInt(0, oLetters.length);
			oLetters[nIdx] = a_oAnswer.charAt(nIdx);
		}
		
		return oLetters;
	}
	
	/** 문자를 출력한다 */
	private static void printLetters(char[] a_oLetters) {
		for(int i = 0; i < a_oLetters.length; ++i) {
			System.out.printf("%c ", a_oLetters[i]);
		}
		
		System.out.println();
	}
}
