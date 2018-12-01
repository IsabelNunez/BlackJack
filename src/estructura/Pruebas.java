package estructura;

public class Pruebas {
	
	/*public static void main(String[] args) {
		
		Palo palo = Palo.CORAZONES;
		
		Carta carta = new Carta(7, palo);
		
		System.out.println(carta); //7♥, 7C
	}*/
	
	public static void main(String[] args) {
		
		// Creamos una baraja y la mostramos por consola.
		Baraja baraja = new Baraja();
		Baraja baraja1 = new Baraja();
		baraja1.intercambioCartas(2, 22);
		for(int i = 0; i < 52; i++) {
			
			System.out.print(baraja.getCarta(i).toString() + "");
		}
		
		System.out.println();
		
		for(int i = 0; i < 52; i++) {
			
			System.out.print(baraja1.getCarta(i).toString() + "");
		}
	}
}
