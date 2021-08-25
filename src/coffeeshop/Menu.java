package coffeeshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // 선언(정의) only. not 실행코드 
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		alName = new ArrayList<String>();
		alPrice = new ArrayList<Integer>();
		
//		this.load();
	}
	/* 생성자 - 일종의 메소드
	 *         용도: 주로 초기화 작업용. 
	           명명법: 이름이 클래스와 같아야 함.
	           반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	           실행/호출: new연산자가 실행된 직후, 자동실행
	           다른 메소드/생성자를 호출할 수 있다.
	*/
	
	void addName(String name) {
		this.alName.add(name);
	}
	
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	
	void appendMenu() {
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		String ma;
		int pa;
		
		System.out.println("메뉴명 입력: (cf.) 공백시 종료.)");
		ma = sc2.nextLine();
		
		while(!ma.equals("")) {
			this.addName(ma);
			System.out.println("가격 입력: ");
			pa = sc3.nextInt();
			this.addPrice(pa);
			System.out.println("메뉴명 입력: (cf.) 공백시 종료.)");
			ma = sc2.nextLine();
		}
	}
	
	void changeMenu(int menu_num, String c_name, int c_price) {
		this.alName.set(menu_num-1, c_name);
		this.alPrice.set(menu_num-1, c_price);
	}
	
	void deleteMenu(int menu_num) {
		this.alName.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
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
