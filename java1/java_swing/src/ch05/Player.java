package ch05;

public class Player extends MoveableAdpter {

	@Override
	public void left() {
		System.out.println("좌표 x 값으로 - 10만큼 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("좌표 x 값으로 + 10만큼 이동합니다.");
	}
	
	@Override
	public void up() {
		System.out.println();
	}

}
