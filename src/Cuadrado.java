
public class Cuadrado extends Poligono {
	
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	
	public int getArea() {
		return lado^2;
		
	}

}
