package Starcrapt.copy;

public class GateWayMainTest3 {

	public static void main(String[] args) {

//		int[] intArr = new int[3];
//		
//		Zealot[] zealots = new Zealot[30];
//		
//		for(int i = 0; i < zealots.length; i++) {
//		// .length =  배열을 반환함 = 크기 3	
//			zealots[i] = new Zealot("질럿"+ (i +1));
//			System.out.println(zealots[i].getName());
//			System.out.println(zealots[i].getHp());
//			System.out.println(zealots[i].getPower());
//			System.out.println("==================");
//		}
//
////    배열은 반복문과 함께 많이 사용
////		zealots[0] = new Zealot("질럿1");
////		zealots[1] = new Zealot("질럿2");
////		zealots[2] = new Zealot("질럿3");
//		
//		System.out.println(zealots[0]);
//		System.out.println(zealots[1]);
//		System.out.println(zealots[2]);
//		
//		System.out.println(zealots[17].getName());
//		System.out.println(zealots[17].getHp());
//		System.out.println(zealots[17].getPower());
//		System.out.println(zealots[17].getName());
//		
		
		GateWay gateWay1 =  new GateWay();
		// 5번 질럿 생산하기
		
		Zealot[] zealotArr = new Zealot[5];
		// i = 1;
		// i = 2;
		// i = 3;
		// i = 4;
		// i = 5; => i가 5보다 크기때문에 4까지 반복하고 종료

//		for(int i = 0; i < 5; i ++){
//			zealotArr[i] = gateWay1.createZealot();
//		}
//		System.out.println(zealotArr[0]);
		
		// 직접 반복값을 지정해주면 실수할 수 있기때문에 .length를 사용하는 것이 더 좋음
		
		
		for (int i = 0; i < zealotArr.length; i++) {
			zealotArr[i] = gateWay1.createZealot();
		}
		System.out.println(zealotArr[0]);
		
		String[] strArr2 = new String[5];
		String[] strArr = {"안","녕"};
//		String[] strArr2 = new String[]
//		String[] strArr2 =  new String[] {"안", "녕", "하"};;
		
		
		int[] intArr = new int[10];
		int num = 1;
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = num++;
			System.out.println(intArr[i]);
		}

		
		
		

	}

}
