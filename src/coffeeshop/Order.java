package coffeeshop;

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	void addOrder(String alMobile, String alMenu, int alCount, int alTotal) {
		this.alMobile.add(alMobile);
		this.alMenu.add(alMenu);
		this.alCount.add(alCount);
		this.alTotal.add(alTotal);
		
	}
	
}
