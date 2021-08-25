package controlStatement;

public class PFor {

	public static void main(String[] args) {
//		for(int n=1; n<=100; n++) {
//			if(n%2==1) {
//				System.out.println(n);
//			}
//		}
		
		for(int n=2; n<=9; n++) {
			for(int i=1; i<=9; i++) {
				System.out.println(n+"X"+i+"="+(n*i));
			}
		}

	}

}
