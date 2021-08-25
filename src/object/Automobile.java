package object;
import java.util.ArrayList;

public class Automobile {

	public static void main(String[] args) {
		Car seltos = new Car(); // seltos => instance variable
//		
//		seltos.nColor = "white"; // setting
//		seltos.maxSpeed = 240;
//		seltos.nSpeed = 0;
//		seltos.guest = 5;
//		seltos.modelName = "Trendy";
//		seltos.nWheel = 4;
//		seltos.dailyRun = new ArrayList<Integer>();
//		seltos.dailyRun.add(23);
//		seltos.dailyRun.add(52);
//		seltos.dailyRun.add(43);
//		seltos.dailyRun.add(112);
//		
//		System.out.println("색상: " + seltos.nColor); // getting
//		System.out.println("최고속도: " + seltos.maxSpeed);
//		System.out.println("현재속도: " + seltos.nSpeed);
//		System.out.println("최대 승객 수: " + seltos.guest);
//		System.out.println("모델명: " + seltos.modelName);
//		System.out.println("바퀴갯수: " + seltos.nWheel);
//		for(int i=0; i<seltos.dailyRun.size(); i++) {
//			System.out.println(seltos.dailyRun.get(i));
//		}
//		 for(int run:seltos.dailyRun) {
//			System.out.println(run);
//		}
		
		// 메소드를 통해서 필드에 접근.
		seltos.setnColor("blue");
		System.out.println("색상: " + seltos.getnColor());
		
		seltos.setGuest(5);
		System.out.println("승객수: " + seltos.getGuest());
		
		seltos.drive(60);
		System.out.println("현재 속도: " + seltos.getnSpeed());
		
		seltos.setnWheel(4);
		System.out.println("바퀴갯수: " + seltos.getnWheel());
		
		seltos.stop();
		System.out.println("현재 속도: " + seltos.getnSpeed());
		
		// 필드에 직접 접근
		// seltos.nColor = "white";
		// System.out.println("색상: " + seltos.nColor);
	}

}
