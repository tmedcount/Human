package carExample;

public class Tire {
	int maxRotation; // 수명
	int accRotation; // 현재까지 회전한 횟수
	String location;
	
	Tire(String loc, int maxRoc) {
		this.location = loc;
		this.maxRotation = maxRoc;
	}
	
	boolean roll() {
		++this.accRotation;
		if(this.accRotation < this.maxRotation) {
			System.out.println(this.location + " Tire 남은 수명: " +(maxRotation-accRotation));
			return true;
		}
		System.out.println(this.location + " Trie 펑크");
		return false;
	}
}
