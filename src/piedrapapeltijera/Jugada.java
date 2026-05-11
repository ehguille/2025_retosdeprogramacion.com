package piedrapapeltijera;

public class Jugada {
	
	private Eleccion ep1;
	private Eleccion ep2;
	
	public Jugada(Eleccion eleccionP1, Eleccion eleccionP2) {
		this.ep1=eleccionP1;
		this.ep2=eleccionP2;		
	}
	
	public String evaluarPartida() {
		if(ep1==Eleccion.PIEDRA&&ep2==Eleccion.PIEDRA)
			return "Empate";
		else if(ep1==Eleccion.PIEDRA&&ep2==Eleccion.PAPEL)
			return "Player 2";
		else if(ep1==Eleccion.PIEDRA&&ep2==Eleccion.TIJERA)
			return "Player 1";
		else if(ep1==Eleccion.PAPEL&&ep2==Eleccion.PIEDRA)
			return "Player 1";
		else if(ep1==Eleccion.PAPEL&&ep2==Eleccion.PAPEL)
			return "Empate";
		else if(ep1==Eleccion.PAPEL&&ep2==Eleccion.TIJERA)
			return "Player 2";
		else if(ep1==Eleccion.TIJERA&&ep2==Eleccion.PIEDRA)
			return "Player 2";
		else if(ep1==Eleccion.TIJERA&&ep2==Eleccion.PAPEL)
			return "Player 1";
		else if(ep1==Eleccion.TIJERA&&ep2==Eleccion.TIJERA)
			return "Empate";
		else
			return "Error";
	}
	
}
