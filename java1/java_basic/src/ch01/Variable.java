package ch01;

public class Variable {

	// 코드의 시작점
	public static void main(String[] args) {
		// 변수를 사용하는 방법
		// 변수는 변하는 수
		int age; // 변수 선언	
		int count; 
		
		age = 1; // ★ [=] (대입연산자) 오른쪽에서 왼쪽으로 연산한다.
					  // 초기화 (값을 넣다)
		count = 100;
		
		System.out.println(age);
		System.out.println("===============");
		System.out.println(count);
		System.out.println("===============");
		
		// 변수는 변하는 수 ★
		
		age = 1000;
		System.out.println(age);
		System.out.println("===============");
		
		//  Tip
		//  변수에는 2가지 종류가 있다.
		//  1. 기본 데이터 타입(값) - int, double, float...
		//  2. 참조 타입 (주소값) - 해시값

		
		// 변수 선언 동시에 초기화
		int level = 2;
		
		level = 3;
		
		System.out.println("레벨 UP : " + level);
		
		level = 4;
		
		System.out.println("레벨 UP : " + level);
		
	} // end of main

} // end of class


















