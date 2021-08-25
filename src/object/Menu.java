package object;
import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	/*
	 **생성자
	 * 	1) 주로 초기화 작업용.
	 * 	2) 이름이 클래스와 같아야 함.
	 * 	3) 반환 값이 없다.
	 * 	4) 실행 => new 연산자가 실행된 직 후, 자동실행.
	 * 	5) 다른 메소드를 호출 가능.		
	 */
	Menu() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();		
	}
	
	void addName(String name) {
		this.alName.add(name);
	}
	
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	
	void showMenu() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println(this.alName.get(i) + "\t" + this.alPrice.get(i));
		}
	}
}