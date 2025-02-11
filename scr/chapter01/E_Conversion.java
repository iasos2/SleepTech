package chapter01;

public class E_Conversion {
	public static void main(String[] args) {
		/*
		 	자바 형 변환 (Type Conversion)
		 	: 하나의 타입을 다른 타입으로 바꾸는 것
		 	
		 	자료형의 크기에 따른 변환 규칙
		 	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 	- 메모리 설계 상(오류) 정수 타입보다 실수 타입이 더 큼
		 	
		 	char (2)
		 	boolean (1)
		 */
		
		// 1. 자동 형 변환 (묵시적)
		// : (작은 자료형을) 크기가 큰! 자료형으로의 변환
		byte smallBox = 10; // 1byte
		int bigBox = 10000; //4byte
		
		// 큰 자료형 = 작은 자료형
		bigBox = smallBox;
		System.out.println(bigBox); // 10
		
		// >> 작은 범위의 타입을 큰 타입에 넣을 때, 컴파일러가 자동으로 형 변환을 수행함
		byte a = 32;
		short b =a;
		int c = b;
		long d = c;
		
		float e = d; // 4byte float에 8byte long 데이터 삽입이 가능
		
		// char f = e; (묵시적 형 변환 X)
		
		// 2. 강제 형 변환 (명시적)
		// : 크기가 작은 자료형으로의 변환
		int number = 1234;
		float fNumber = number;
		
		float fNumber2 = 1234.123F;
		
		// 강제 형 변환: (작은 자료형 타입) 큰 데이터값;
		int number2 = (int)fNumber2;
		
		long aa = 32L;
		int bb = (int)aa;
		short cc = (short)bb;
		byte dd = (byte)cc;
	}
}
