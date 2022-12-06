package ch18;

public class MainTest {

	public static void main(String[] args) {
		
		Student student = new Student(0,"");
		System.out.println(student.toString());
		System.out.println(student.hashCode());
		
		Book book1 = new Book(1, "감자삶아먹기", "이춘식");
		Book book2 = new Book(2, "감자삶아먹기", "오춘식");
		Book book3 = new Book(3, "감자튀겨먹기", "박춘식");
		Book book4 = new Book(4, "감자튀겨먹기", "박춘식");
		
		System.out.println(book1);
		System.out.println(book2);
		// Object -> equalse 상속을 받아서 사용 가능.
		if(book3.equals(book4)) {
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
		
		
		
	}
}
