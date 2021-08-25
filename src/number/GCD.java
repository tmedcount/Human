package number;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min;
		
		if(a<b) {
			min=a;
		} else{
			min=b;
		}
		
		int c = 0;
		
		for(int i=1; i<=min; i++) {
			if(a%i==0 && b%i==0) {
				c=i;
			}
		}
		
		System.out.println("최대공약수: " + c);
		System.out.println("최소공배수: " + a*b / c);

	}

}
