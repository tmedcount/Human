package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ALPlusScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		System.out.println("수학 점수를 입력하세요.");
		
		int s = sc.nextInt();
			
		while(s!=-1) {
			score.add(s);
			s = sc.nextInt();
		}

		System.out.println("프로그램 종료.");
		System.out.println("모든 학생의 점수: " + score);
				
		int sum = 0;
		for(int i = 0; i<score.size(); i++) {
			sum += score.get(i);
		}
		
		System.out.println("모든 학생의 점수의 총합: " + sum);
		System.out.println("모든 학생의 점수의 평균: " + (sum / score.size()));

	}

}