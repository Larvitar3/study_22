package starcrapt3;

public class Zealot extends Unit implements Protoss {

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

//	@Override
//	public void attack(Zealot zealot) {
//		if(this == zealot) {
//			System.out.println("자기 자신을 공격할 수 없습니다.");
//		}else {
//			super.attack(zealot);
//		}
//	}

	@Override
	public void attack(Unit unit) {
		
		// instaceOf
		System.out.println("[시스템] " + this.name + " ▶ " + unit.getName() + " 공격");
		unit.beAttacked(this.power);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
