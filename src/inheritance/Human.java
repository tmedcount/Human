package inheritance;

public class Human extends Animal { // Human은 Animal을 상속한다.
	// ChildClass and SubClass
	// Constructor Overloading도 된다. cf.) 따로 만들어도 된다.(Constructor Overriding - 무시한다.)
	
	Human() { // Constructor Overriding(이름이 다르다)
		super(6, 6);  // 부모의 생성자 사용 가능.
	}
	
	void run() { // Method Overriding(이름이 같다)
		System.out.println("걷는다");
	}
	
	void sound() { // Method Overriding(이름이 같다)
		System.out.println("말한다.");
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}
