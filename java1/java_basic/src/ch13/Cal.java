package ch13;

public class Cal {
	
	public int sum(int n1, int n2) {
		
		return n1 + n2;
		
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

}

class Cal2 extends Cal{
	public int minus(int n1, int n2) {
		return n1 - n2 ;
	}
	
	@Override
	// 오버라이드 != 오버로딩
	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

	
	
	
}



