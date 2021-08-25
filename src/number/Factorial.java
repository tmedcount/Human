package number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("10이하의 양의 정수.");
		
		int n = sc.nextInt();
		int fac = 1;
						
		if(1<=n && n<=10) {
			for(int i=1; i<=n; i++) {
				fac = fac*i;
			}
			System.out.println(n + "! = " + fac);
		} else {
			System.out.println("프로그램 종료.");
		}
		
	}

}
