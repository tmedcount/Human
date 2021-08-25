package phone;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	public void turnOn() {
		System.out.println("스마트전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("스마트전원을 끕니다.");
	}
}
