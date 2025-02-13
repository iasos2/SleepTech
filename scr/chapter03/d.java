package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adqw {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<>();
		items.add("볼펜");		
		items.add("연필"); // 동적 배열에 단어 5개를 삽입
		items.add("치즈"); // 동적 배열에 단어 5개를 삽입
		items.add("커피"); // 동적 배열에 단어 5개를 삽입
		items.add("똥"); // 동적 배열에 단어 5개를 삽입
		
		Random random = new Random(); // 무작위 수
		int index = random.nextInt(items.size()); //배열에 넣어진 만큼 크기 
		
		String selectedItem = items.get(index); // 무작위 아이템 추출 가져오기
		
		Scanner sc = new Scanner(System.in); // 입력 받자
		String userGuess; // 스캐너 역할할 애
		
		while(true) { // 반복문 맞다면
			System.out.println("아이템을 맞춰보세요.");
			userGuess = sc.nextLine(); // 입력 받는 창
			if (userGuess.equals(selectedItem)) { 
				// 선택된 아이템과 입력받는 아이템이 일치한다면?
				System.out.println("정답입니다.");
				break; // 출력 후 종료
			} else if (userGuess.equals("종료")) {
				// 종료라고 한다면? 
				break; // 그냥 종료
			} else {
				System.out.println("틀렸습니다. 다시 시도해주세요.");
			} // 나머지 답안은 틀렸다고 출력
		}
		sc.close(); // 입력창 닫고
		System.out.println("프로그램이 종료되었습니다.");
		// 프로그램 종료하기

	}

}
