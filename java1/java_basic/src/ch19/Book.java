package ch19;

public class Book {

	private String bookId;
	private String title;
	private String aurhor;

	public Book(String bookId, String title, String aurhor) {
		this.bookId = bookId;
		this.title = title;
		this.aurhor = aurhor;
	}

	@Override
	public String toString() {
		return this.title;
	}

	@Override
	public boolean equals(Object obj) {
		// 현재 객체title과 obj안에 들어오는 녀석의 title 글자가 같다면 true를 리턴 아니면 false 리턴
		// 1. this.title과 Object녀석과 값이 같다면 같은 책 이라고 판별
		// 2. Object 타입은 모든클래스의 최상위이기때문에 아무것이든 들어올수 있다.
		// 3. 추가적인 데이터가 필요하다면 코드를 추가하면 된다.
		// 책이름과 저자가 같다면 같은책으로 판별
		
		if (obj instanceof Book) {
			Book tempBook = (Book)obj;
			if (this.title == tempBook.title && this.aurhor == tempBook.aurhor) {
				return true;
			} else {
				return false;
			}
		}
		System.out.println("책 객체를 비교해봅니다.");
		return false;
	}

	
	public void showInfo() {
		System.out.println("==== 책정보 ====");
		System.out.println("책 제목: " + this.title);
	}
	
	
	
	
	
	
	
	
	
	
	
}
