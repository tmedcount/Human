package number;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int n=2; n<=10000; n++) {
			int i;
			for(i=2; i<n; i++) {
				if(n%i==0) {
					break;
				}
			}
			if(n==i) {
				System.out.println(n);
			}
		}
	}
}
