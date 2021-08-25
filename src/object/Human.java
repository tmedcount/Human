package object;

public class Human {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "KangHosung";
		s1.nYear = 3;
		s1.nClass = 6;
		s1.nNumber = 1;
		s1.birthday = "19920225";
		s1.gender = "male";
		s1.mobile = "01040301062";
		
		System.out.println("학생이름: " + s1.name);
		System.out.println("학년: " + s1.nYear);
		System.out.println("반번호: " + s1.nClass);
		System.out.println("학생번호: " + s1.nNumber);
		System.out.println("생년월일: " + s1.birthday);
		System.out.println("성별: " + s1.gender);
		System.out.println("모바일번호: " + s1.mobile);
		
	}

}
