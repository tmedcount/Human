package basic;
import java.util.Scanner;

public class TypeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int n = Integer.parseInt(str);
		
		int x = (n==1)?10:100;
		
		System.out.println(x);

	}

}
