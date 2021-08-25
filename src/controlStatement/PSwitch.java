package controlStatement;
import java.util.Scanner;

public class PSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String init = sc.nextLine();
		
//		if(init.equals("a") || init.equals("A")) {
//			System.out.println("Apple");
//		} else if(init.equals("b") || init.equals("B")) {
//			System.out.println("Banana");
//		} else if(init.equals("W") || init.equals("W")) {
//			System.out.println("Watermelon");
//		} else if(init.equals("s") || init.equals("S")) {
//			System.out.println("Strawberry");
//		} else {
//			System.out.println("모르는 이니셜.");
//		} 
//		System.out.println("프로그램 종료.");
		
		switch(init) {
		case "a":
		case "A":
			System.out.println("Apple");
			break;
		case "b":
		case "B":
			System.out.println("Banana");
			break;
		default:
			System.out.println("모르는 이니셜.");
		}
		System.out.println("프로그램 종료.");
	}

}
