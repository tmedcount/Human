package arrayList;

import java.util.ArrayList;

public class ArrayLIst {

	public static void main(String[] args) {
		// Array
		int[] pnt = new int[5]; // default = 0
				
		// ArrayList - CRUD
		ArrayList<String> studentName = new ArrayList<String>();
		
		studentName.add("John");
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		studentName.add("James");
		
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i));
		}
		
		System.out.println("\n\n");
		
		studentName.set(3, "Jefferson");
		
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i));
		}
		
		System.out.println("\n\n");
		
		studentName.remove(3);
		studentName.remove("Jason");
		
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i));
		}
		
		System.out.println("\n\n");
		
		studentName.clear();
		
		System.out.print("클리어 한 후 for문 출력(아래)");
		
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i));
		}
		
		ArrayList<Integer> point = new ArrayList<Integer>();
		point.add(100);
		point.add(84);
	}

}
