package number;

public class Snake {

	public static void main(String[] args) {
		int n=6;
		int s=0;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<n; j++) {
					s++;
					System.out.print(s+"\t");
				}
				System.out.println("");
				s=s+n;
			} else {
				for(int j=0; j<n; j++) {
					System.out.print(s+"\t");
					s--;
				}
				s=s+n;
				System.out.println("");				
			}
		}
		
	}

}