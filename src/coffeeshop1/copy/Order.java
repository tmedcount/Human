package coffeeshop1.copy;

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	Order(){
		this.alMobile = new ArrayList<String>();
		this.alMenu = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alTotal = new ArrayList<Integer>();
	}
	
	int addOrder(String name, int price, int cnt) {
		// 주문메뉴명 추가
		// 주문수량 추가
		// 합계계산+추가+반환
		
		this.alMenu.add(name);
		this.alCount.add(cnt);
		this.alTotal.add(price*cnt);
		
		System.out.println(name + "\t 수량: " + cnt + "\t 합계: " + price*cnt);

		for(int i=0; i<alMenu.size(); i++) {
			System.out.println(alMenu.get(i) + "\t" + alCount.get(i) + "\t" + alTotal.get(i));
		}
		
		int sum = 0;
		
		for(int i=0; i<alTotal.size(); i++) {
			sum += alTotal.get(i);
		}
		
		return sum;
				
	}		
}
