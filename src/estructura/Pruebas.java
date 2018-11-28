package estructura;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Palo palo = Palo.CORAZONES;
		Carta carta = new Carta(7, palo);
		
		System.out.println(carta); //7♥
	}
}
