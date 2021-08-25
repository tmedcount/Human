package interfaceExample;

public class Television implements RemoteControl {
	private int volumn;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int n) {
		if(n>RemoteControl.MAX_VOLUME) {
			this.volumn = RemoteControl.MAX_VOLUME;
		} else if(n<RemoteControl.MIN_VOLUME) {
			this.volumn = RemoteControl.MIN_VOLUME;
		} else {
			this.volumn = n;
		}
		System.out.println("현재 TV 볼륨: " + this.volumn);
 	}

}
