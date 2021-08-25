package phone;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void turnOn();	
	public abstract void turnOff();

}
