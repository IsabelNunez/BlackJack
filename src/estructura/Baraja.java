package estructura;

public class Baraja {
	
	private Carta[] baraja;
	
	public Baraja() {
		
		// La baraja está formada por 52 cartas
		baraja = new Carta[52]; // Inicializamos el array;
		
		Palo palo = null;
		
		int posCarta = 0;
		
		for(int i = 0; i < 4; i++) {
			
			switch(i) {
			case 0:
				palo = Palo.CORAZONES;
			break;
			case 1:
				palo = Palo.DIAMANTES;
			break;
			case 2:
				palo = Palo.TREBOLES;
			break;
			case 3:
				palo = Palo.PICAS;
			}
			
			for(int j = 1; j <= 13; j++) {
				
				Carta carta = new Carta(j,palo);
				baraja[posCarta] = carta;
				++posCarta;
			}
		}	
	}
	
	// Nos devuelve la carta que esté en la posición que le pasemos.
	public Carta getCarta(int posicion) {
		
		return baraja[posicion];
	}
	
	// Coloca una carta en la posición que le pasemos.
	public void setCarta(int posicion, Carta carta) {
		
		baraja[posicion] = carta;
	}
	
	// Intercambiamos dos cartas en la baraja.
	public void intercambioCartas(int posicionCarta1, int posicionCarta2) {
		
		// Le restamos 1 porque empieza en 0 el array de baraja.
		Carta tmp = getCarta(posicionCarta1-1);
		
		setCarta(posicionCarta1-1, getCarta(posicionCarta2-1));
		setCarta(posicionCarta2-1, tmp);
	}	
}
