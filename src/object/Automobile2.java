package object;

public class Automobile2 {

	public static void main(String[] args) {
		Car2 car2 = new Car2();
		System.out.println(car2.getnColor());
		System.out.println(car2.getMaxSpeed());
		System.out.println(car2.getnSpeed());
		System.out.println(car2.getGuest());
		
		System.out.println("────────────────");
				
		Car2 avante = new Car2("white", 290, 30, 5);
		System.out.println(avante.getnColor());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		System.out.println(avante.getGuest());
		
		System.out.println("────────────────");
		
		Car2 grandeur = new Car2("black", 320, 50, 5, "Grandeur", 4);
		System.out.println(grandeur.getnColor());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getnWheel());
		
	}

}
