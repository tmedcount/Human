package coffeeshop;

import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		menu.load();
		
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력: ");
//		
//		String name=s1.nextLine();
//		
//		while(!name.equals("")) {
//			System.out.println("가격 입력: ");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력: ");
//			name=s1.nextLine();
//		}
//		
//		System.out.println("메뉴 목록")		
//		s1.close(); s2.close();
		
//		m: 메뉴관리
//		o: 주문받기
//		s: 실적보기
//		x: 프로그램 종료.
		
		System.out.println("작업을 선택하세요.(m:메뉴관리, o:주문, s:실적, x:프로그램 종료)");
		
		Scanner sc = new Scanner(System.in);
		String comm = sc.nextLine();
		
		while(!comm.equals("x")) {
			switch(comm) {
				case "m":
					System.out.println("메뉴관리");
					
					menu.showMenu();

					// CRUD
					System.out.println("메뉴작업을 선택하세요.(c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료)");
					
					comm = sc.nextLine();
					
					while(!comm.equals("q")) {
						switch(comm) {
							case "c":
								menu.appendMenu();
								break;
								
							case "r":
								menu.showMenu();
								break;
							
							case "u":								
								Scanner mci = new Scanner(System.in);
								Scanner mcm = new Scanner(System.in);
								Scanner mcp = new Scanner(System.in);
								
								System.out.println("수정하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
								int mNum = mci.nextInt();
								
								while(mNum!=0) {
									System.out.println("메뉴명 입력: ");
									String mName = mcm.nextLine();
									System.out.println("메뉴가격 입력: ");
									int mPrice = mcp.nextInt();
									
									menu.changeMenu(mNum, mName, mPrice);
									
									System.out.println("수정하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
									mNum = mci.nextInt();
								}

								break;
								
							case "d":
								System.out.println("메뉴삭제");
								
								Scanner mdis = new Scanner(System.in);
																
								System.out.println("삭제하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
								int mdi = mdis.nextInt();
								
								while(mdi!=0) {
									menu.deleteMenu(mdi);
									System.out.println("삭제하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
									mdi = mdis.nextInt();
								}
								
								System.out.println("메뉴삭제 종료.");
									break;
						}
						
						System.out.println("메뉴작업을 선택하세요.(c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료)");
						comm = sc.nextLine();
					}
					
					System.out.println("메뉴관리 종료.");
					menu.save();
					break;
					
				case "o":
					System.out.println("주문받기");
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
