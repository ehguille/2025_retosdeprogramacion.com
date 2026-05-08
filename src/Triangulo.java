
public class Triangulo extends Poligono {
	
	private int base, altura;
	
	public Triangulo(int base, int altura) {
		//Faltan comprobaciones (>0)
		this.base=base;
		this.altura=altura;
	}
	
	public int getArea() {
		return base*altura/2;
	}

}
