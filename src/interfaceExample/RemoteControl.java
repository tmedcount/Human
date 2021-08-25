package interfaceExample;

public interface RemoteControl {
	/*
	 * 상수
	 * 추상 메소드
	 * 디폴트 메소드
	 * 정적 메소드
	 */
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("\n건전지를 교체합니다.");
	}
}
