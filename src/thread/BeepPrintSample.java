package thread;

public class BeepPrintSample {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread t = new Thread(beepTask);
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}

	}

}
