package coffeeshop1.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		alName = new ArrayList<String>();
		alPrice = new ArrayList<Integer>();
	}
	
	void addName(String name) {
		this.alName.add(name);
	}
	
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	
	String getName(int menuNum) {
		
		return this.alName.get(menuNum-1);
	}
	
	int getPrice(int menuNum) {
		
		return this.alPrice.get(menuNum-1);
	}
	
	void appendMenu() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String menuNameAdd;
		int menuPriceAdd;
		
		System.out.println("메뉴명 입력: (cf.) 공백시 종료.)");
		menuNameAdd = sc.nextLine();
		
		while(!menuNameAdd.equals("")) {
			this.addName(menuNameAdd);
			System.out.println("가격 입력: ");
			menuPriceAdd = sc2.nextInt();
			this.addPrice(menuPriceAdd);
			System.out.println("메뉴가 추가되었습니다.");
			System.out.println("메뉴명 입력: (cf.) 공백시 종료.)");
			menuNameAdd = sc.nextLine();
		}
	}
	
	void changeMenu() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
//		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("수정하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
		int menuChaIndex = sc.nextInt();
		
		while(menuChaIndex!=0) {
			System.out.println("새메뉴명 입력: ");
			String menuChaName = sc2.nextLine();
			System.out.println("새메뉴가격 입력: ");
			int menuChaPrice = sc.nextInt();
			this.alName.set(menuChaIndex-1, menuChaName);
			this.alPrice.set(menuChaIndex-1, menuChaPrice);
			System.out.println("메뉴가 수정되었습니다.");
			System.out.println("수정하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
			menuChaIndex = sc.nextInt();
		}
	}
	
	void deleteMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
		int menuDelIndex = sc.nextInt();
		
		while(menuDelIndex!=0) {
			this.alName.remove(menuDelIndex-1);
			this.alPrice.remove(menuDelIndex-1);
			System.out.println("메뉴가 삭제되었습니다.");
			System.out.println("삭제하려는 메뉴번호 입력: (cf.) 0입력시 종료.)");
			menuDelIndex = sc.nextInt();
		}
	}
	
	void showMenu() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println(i+1 + "\t" + this.alName.get(i) + "\t" + this.alPrice.get(i));
		}
	}
	
	void save() { // arraylist alName, alPrice를 menu.txt에 저장.
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<this.alName.size();i++) {
					String line = this.alName.get(i)+","+this.alPrice.get(i);
					writer.write(line);
					if((i+1)!=this.alName.size())
						writer.write("\r\n");
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	void load() {
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();
				while(line!=null) {
					String[] parts = line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line=inFile.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
