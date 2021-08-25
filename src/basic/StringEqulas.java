package basic;
import java.util.Scanner;

public class StringEqulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String myName;
		
		myName = sc.nextLine();
		
		if(myName.equals("KHS")) {
			System.out.println("KangHoSung");
		}
	}

}
