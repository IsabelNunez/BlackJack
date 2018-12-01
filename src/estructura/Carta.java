package estructura;
/* La clase Carta tiene un valor comprendido entre {1-13}
 * {1-A,...,11-J,12-Q,13-K}
 * y un palo entre los cuatro que forman el enumerado. 
 */

public class Carta {

	private int valor;
	private Palo palo;
	
	public Carta(int valor, Palo palo) {
		
		this.valor = valor;
		this.palo = palo;
	}
	
	public String toString() {
		
		String valorString = valor + "";
		return valorString + palo.getLetraInicialPalo();
	}
}
