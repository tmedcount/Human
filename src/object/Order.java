package object;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("메뉴명 입력(단, 메뉴명 미입력시 종료):");
		String x = sc1.nextLine(); // 메뉴명 읽기 
		
		Scanner sc2 = new Scanner(System.in);
		int y;
		
		while(!x.equals("")) {
			System.out.println("가격 입력:");
			y = sc2.nextInt(); // 가격 읽기
			menu.addName(x);
			menu.addPrice(y);
			System.out.println("메뉴명 입력:");
			x = sc1.nextLine();
		}
		
		System.out.println("메뉴 목록:");
		menu.showMenu();
		sc1.close();
		sc2.close();
		System.out.println("프로그램 종료.");
	}

}
