package ch01;

public class DataType2 {

	public static void main(String[] args) {
		
		char name; //2바이트 공간에 문자 하나를 담을 수 있다.
		char a;
		char initial;
		
		// char 값을 초기화 하는 방법
		
		name = 'A';
	//	 name = "A";  <= (오류) 쌍따옴표 사용 시 오류 발생. 홑따옴표만 가능 ★
	// name = 'AB'; <= (오류) char Type은 단 하나의 문자만 저장 가능
		
		System.out.println(name);
		System.out.println("============");
		System.out.println("a");
		System.out.println("============");
		System.out.println("b");
		System.out.println("============");
		System.out.println("c");
		
	} // end of main

} // end of class
