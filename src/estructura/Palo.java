package estructura;

public enum Palo {
	
	CORAZONES('♥', "C"), DIAMANTES('♦', "D"), TREBOLES('♣', "T"), PICAS('♠', "P");
	
	private Palo(char simbolo, String letraInicialPalo) {
		
		this.simbolo = simbolo;
		this.letraInicialPalo = letraInicialPalo;
		
	}
	
	public char getSimbolo() {
		return simbolo;
	}
	
	public String getLetraInicialPalo() {
		
		return letraInicialPalo;
	}
	
	private char simbolo;
	private String letraInicialPalo;	
}
