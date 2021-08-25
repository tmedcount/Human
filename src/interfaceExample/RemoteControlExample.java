package interfaceExample;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
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

		}; // 인터페이스명 인스턴스변수명 = new 구현클래스명();
		tv.turnOn();
		tv.setMute(false);
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBattery();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();
	}

}
