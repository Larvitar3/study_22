package starcrapt3;

public class Zergrling extends Unit implements Zerg{
;

	public Zergrling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
	}

	@Override
	public void attack(Unit unit) {	
			// instaceOf
			System.out.println("[시스템] " + this.name + " ▶ " + unit.getName() + " 공격");
			unit.beAttacked(this.power);
		
	}
	
	


}
