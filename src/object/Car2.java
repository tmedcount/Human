package object;
import java.util.ArrayList;

public class Car2 {
	private String nColor;
	private int maxSpeed;
	private int nSpeed;
	private int guest;
	private String modelName;
	private int nWheel;
	
	public Car2() {
		this("blue", 400, 0, 2);
	}

	public Car2(String nColor, int maxSpeed, int nSpeed, int guest) {
		this.nColor = nColor;
		this.maxSpeed = maxSpeed;
		this.nSpeed = nSpeed;
		this.guest = guest;
	}

	public Car2(String nColor, int maxSpeed, int nSpeed, int guest, String modelName, int nWheel) {
		this(nColor, maxSpeed, nSpeed, guest);
		
		this.modelName = modelName;
		this.nWheel = nWheel;
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

}
