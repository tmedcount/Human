package controlStatement;
import java.util.Scanner;

public class PIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		
		String str = sc.nextLine();
		int n = Integer.parseInt(str);		
		
		if(n > 89) {
			System.out.println("A");
		} else if(n > 79) {
			System.out.println("B");
		} else if(n > 69) {
			System.out.println("C");
		} else if(n > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
