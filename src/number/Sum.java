package number;

public class Sum {

	public static void main(String[] args) {
		int n=0;
		
		for(int i=1; i<=100; i++) {
		// n = n+i;
			n += i;
		}
		
		System.out.println("1부터 100까지의 합: " + n);
		
	}

}