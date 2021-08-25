package controlStatement;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		do {
			switch(str) {
			case "m":
				System.out.println("메뉴리스트");
				break;
			case "o":
				System.out.println("주문");
				break;
			case "s":
				System.out.println("매출현황");
				break;
			}
			
			str = sc.nextLine();
		} while(!str.equals("x"));
		
		System.out.println("프로그램 종료.");
	}
}
