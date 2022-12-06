package interfaces2;

public class MainTest {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
//		
//		televison.trunOn();
//		televison.turnOff();
//		System.out.println();
//		refrigerator.trunOn();
//		refrigerator.turnOff();
//		System.out.println();
//		robot.trunOn();
//		robot.turnOff();
//		
		RemoteController[] remoteControllers = new RemoteController[3];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;

		// 지금까지는 index를 활용한 for
		// 초기화 for 문
		for (RemoteController a : remoteControllers) {

			a.trunOn();
			a.turnOff();
			System.out.println();

		}

		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOff();
		}
		
		
		int result = 0;
		for (int i = 0; i < remoteControllers.length; i++) {
			
			if(remoteControllers[i] instanceof ToyRobot) { // <= 다운캐스팅
				System.out.println(	((ToyRobot)remoteControllers[i]).name); // <= 다운캐스팅
				result++;
			}	
		}
		System.out.println("장난감 로봇은 "  + result + " 개 있습니다.");
		
		for (RemoteController remoteController : remoteControllers) {
			if(remoteController instanceof ToyRobot) {
				System.out.println(	((ToyRobot)remoteController).name);
				((ToyRobot) remoteController).soundOn();

			}
		}
		
		// 인터페이스
		// 인터페이스 선언
		// 
		
		
		
		
	}
}
