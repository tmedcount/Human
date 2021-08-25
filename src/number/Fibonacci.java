package number;

import java.util.Scanner;

public class Fibonacci {
	
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//
//	int sum1=0;
//	int sum2=1;
//	int sum3=0;
//	
//	if(n>=0) {
//		System.out.println(sum1);
//	}
//	if(n>=1) {
//		System.out.println(sum2);
//	}
//	
//	while(sum3<=n) {
//		System.out.println(sum3);
//		sum1 = sum2;
//		sum2 = sum3;
//		sum3 = sum1+sum2;
//	}

	public static void main(String[] args) {
		int sum1=0;
		int sum2=1;
		int sum3=sum1+sum2;
		
		while(sum3<=10000) {
			System.out.println(sum3);
			sum1=sum2;
			sum2=sum3;
			sum3=sum1+sum2;
		}

	}

}
