package chapter02;
import java.util.Scanner;

public class B_Switch {

	public static void main(String[] args) {
		// switch 조건문
		// : 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정
		// : 비교할 변수와 case 값을 비교하여 같은 값일 경우 해당 블록부터 끝까지 실행
		// - break 키워드에서 switch 문이 종료

		/*
		  switch (조건변수) {
		  	case 조건값1:
		  		실행 문장;
		  	case 조건값2:
		  		실행 문장;
		  	case 조건값3:
		  		실행 문장;
		  	...
		  	default:
		  		case 조건식이 끝난 뒤 작성
		  		>> 어느 case에도 일치하지 않는 경우 실행
		  	}
		  	
		  	>> full-through 상태
		  		: case 영역 내에서 break 키워드를 사용
		 */
		
		// 예제 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Chapter를 선택하세요.");
		int chapter = sc.nextInt();
		
		switch (chapter) {
		case 1:
			System.out.println("자바 기본 문법");
			break;
			// System.out.println("해당 내용은 출력은?");
		case 2:
			System.out.println("자바 제어문 - 조건문/반복문");
			break;
		case 3:
			System.out.println("자바 배열");
			break;
		default:
			System.out.println("유효한 chapter가 아닙니다.");
		}
		
		sc.nextLine(); // 개행 문자 (enter) 값 처리
		
		// 예제 2
		System.out.println("과일의 이름을 입력하세요");
		String fruit = sc.nextLine();
		
		switch (fruit) {
		case "banana":
			System.out.println("노란색");
			break;
		case "orange":
			System.out.println("주황색");
			break;
		case "grape":
			System.out.println("보라색");
			break;
		default:
			System.out.println("유효한 과일이 아닙니다.");
		}
		
		sc.close(); // 입력기.close;
		
