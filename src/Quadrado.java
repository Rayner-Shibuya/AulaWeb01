
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int lado) {
		super(lado, lado);
	}
	
	public double calcDiagonal() {

		return (getAltura() * Math.sqrt(2));
	}
}
