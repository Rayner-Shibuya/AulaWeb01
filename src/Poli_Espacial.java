
public abstract class Poli_Espacial extends Espacial {

	private double area;
	private double altura;
	private double volume;

	public Poli_Espacial(double area,double altura) {
		setArea(area);
		setAltura (altura);

	}
	
	public double volume() {
		
		return getArea() * getAltura();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
}
