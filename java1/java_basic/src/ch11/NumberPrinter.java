package ch11;

public class NumberPrinter {

	private int id;
	private static int waitNumber;

	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	public NumberPrinter() {
		this.waitNumber = 1;
	}

	// 번호표를 출력
	public void printWaitNumber() {
		System.out.println(id + "번 기기의  대기 순번  : " + waitNumber);
		waitNumber++;
	}

	public static void main(String[] args) {
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);

		numberPrinter1.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		
		
//		numberPrinter2.printWaitNumber();
//		numberPrinter2.printWaitNumber();
		// static

	}

}
