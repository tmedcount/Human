package coffeeshop1.copy;

import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		menu.load();
		
		System.out.println("작업을 선택하세요.(m:메뉴관리, o:주문, s:실적, x:프로그램 종료)");
		
		Scanner sc = new Scanner(System.in);
		Scanner scAdd = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		String comm = sc.nextLine();
		
		while(!comm.equals("x")) {
			switch(comm) {
				case "m":
					System.out.println("메뉴관리");
					
					menu.showMenu();

					System.out.println("메뉴작업을 선택하세요.(c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료)");
					
					String comm1 = scAdd.nextLine();
					
					while(!comm1.equals("q")) {
						switch(comm1) {
							case "c":
								menu.appendMenu();
								break;
								
							case "r":
								menu.showMenu();
								break;
							
							case "u":								
								menu.changeMenu();
								break;
								
							case "d":
								menu.deleteMenu();
								break;
						}
						
						System.out.println("메뉴작업을 선택하세요.(c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료)");
						comm1 = scAdd.nextLine();
					}
					
					System.out.println("메뉴관리 종료.");
					menu.save();
					break;
					
				case "o":
					System.out.println("주문받기");
					
					menu.showMenu();
					
					Order order = new Order();
										
					System.out.println("메뉴번호를 선택하세요. (cf. ) 0 입력시 종료)");
					int menuNum = sc2.nextInt();
					int menuCnt = 0;
					int sum = 0;
										
					while(menuNum!=0) {
						String menuName = menu.getName(menuNum);
						int menuPrice = menu.getPrice(menuNum);
						
						System.out.println("메뉴수량을 입력하세요.");
						menuCnt = sc.nextInt();
						
						sum = order.addOrder(menuName, menuPrice, menuCnt);
						System.out.println("총합계: " + sum);						
																		
						System.out.println("메뉴번호를 선택하세요. (cf. ) 0 입력시 종료)");
						menuNum = sc2.nextInt();
					}					
					
					break;
					
				case "s":
					System.out.println("실적보기");
					break;
			}
			
			System.out.println("작업을 선택하세요.(m:메뉴관리, o:주문, s:실적, x:프로그램 종료)");
			comm = sc.nextLine();
		}
		
		System.out.println("프로그램 종료.");	

		menu.showMenu();

	}
}
