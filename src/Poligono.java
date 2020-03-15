
public abstract class Poligono extends Plano{

	private int base;
	private int altura;
	
	public Poligono(int base,int altura) {
		setBase(base);
		setAltura (altura);
	}
	
	public double perimetro() {
		
		return 2 * (getBase() + getAltura());
	}
	
	public double area() {
		
		return getBase() * getAltura();
	}
	
	public int getBase() {
		
		return base;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setBase(int base) {
		this.base = base;
	}


}
