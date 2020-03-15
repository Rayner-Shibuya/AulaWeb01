
public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(int base, int altura) {
		super(base, altura);
	}

	public double calcDiagonal() {

		return (getAltura() * Math.sqrt(2));
	}
}
