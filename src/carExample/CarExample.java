package carExample;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=0; i<=5; i++) {
			int punkTire = car.run();
			switch(punkTire) {
				case 1: // frontLeft
					System.out.println("왼쪽 앞 펑크");
					break;
				case 2: // frontRight
					System.out.println("오른쪽 앞 펑크");
					break;
				case 3: // backLeft
					System.out.println("왼쪽 뒤 펑크");
					break;
				case 4: // backRight
					System.out.println("오른쪽 뒤 펑크");
					break;
			}
			if(punkTire!=0) break;
		}

	}

}
