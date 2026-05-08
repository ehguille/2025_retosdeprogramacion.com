
public class Rectangulo extends Poligono {
	
	private int base, altura;
	
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public int getArea() {
		return base*altura;
		
	}

}
