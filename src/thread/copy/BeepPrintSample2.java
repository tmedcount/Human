package thread.copy;

public class BeepPrintSample2 {

	public static void main(String[] args) {
		Thread t = new Task();
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}

	}

}
