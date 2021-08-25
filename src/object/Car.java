package object;
import java.util.ArrayList;

public class Car {
	/* 
	 * 속성(Property) => 변수 = 필드(Java) / 멤버변수(C++)
	 * 동작(method) => 함수 = 메소드(Java) / 멤버함수(C++)
	*/ 
	private String nColor;
	private int maxSpeed;
	private int nSpeed;
	private int guest;
	private String modelName;
	private int nWheel;
	private ArrayList<Integer> dailyRun;
		
	void drive(int x) {
		this.nSpeed = x;
	}
	void stop() {
		this.nSpeed = 0;
	}
	public String getnColor() {
		return nColor;
	}
	public void setnColor(String nColor) {
		this.nColor = nColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getnWheel() {
		return nWheel;
	}
	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}
	public ArrayList<Integer> getDailyRun() {
		return dailyRun;
	}
	public void setDailyRun(ArrayList<Integer> dailyRun) {
		this.dailyRun = dailyRun;
	}
	
	
	

}
