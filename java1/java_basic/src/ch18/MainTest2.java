package ch18;

public class MainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "자이라");
		Student student2 = new Student(2, "스웨인");
		Student student3 = new Student(3, "벨코즈");
		Student student4 = new Student(1, "자이라");

		System.out.println(student1);
		
		// ( == ) 객체가 메모리에 올라가있는 주소값을 비교
		// 물리적인 확인
		if(student1 == student4) {
			System.out.println("같은학생입니다.");
		}else {
			System.out.println("다른학생입니다.");
		}
		
		System.out.println("================");
		
		// 논리적인 확인(우리가 판단 근거로하는 데이터)
		if(student1.equals(student4)) {
			System.out.println("같은학생입니다.");
		}else {
			System.out.println("다른학생입니다.");
		}
		
		
		
		
		
		
		
	}
	
	

}
