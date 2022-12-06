package ch01;

public class DataType1 {

	// main 함수는 코드의 시작점
	public static void main(String[] args) {
		
		// 데이터 타입에 종류는 크게 2가지
		// 1. 기본 데이터 타입 (primitive type)
		// 2. 참조 타입 (Reference Type) => 주소값
		
		// 기본 데이터 타입의 종류
		byte b;   // 1byte (8bit)
		short s; // 2byte (16bit)
		int i;       // 4byte (32bit)
		long l;    // 8byte (64bit)
		
		// b = 128; => 오류 (127까지 입력가능)
		b = 127;
		b = -128;
		
		// i = 2200000000; => 오류 (21억까지 입력 가능)
		
		// 접미사를 사용해야지 표현 가능 (L, l 대소문자 상관 없음) ★ 권장사항은 L(대문자)
		l = 2200000000L;
		
		double  dou;
		dou = 10.5;
		
		// 접미사를 사용해야지 표현 가능 (F, f 대소문자 상관 없음) ★ 권장사항은 F(대문자)
		float fot;
		fot = 10.5F;
		
		// 기본 연산자 : 정수(int), 실수(double)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of main

}// end of class

// 블록의 범위는 절대적이다.
