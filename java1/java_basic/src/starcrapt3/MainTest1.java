package starcrapt3;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergrling zergrling1 = new Zergrling("저글링1");
		
		zealot1.attack(marine1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		
		marine1.showInfo();
		zealot1.showInfo();

	}

}
