import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Plano> plano = new ArrayList();
		
		plano.add(new Quadrado (2));
		plano.add(new Triangulo (2,5));
		plano.add(new Losango (5,10));
		plano.add(new Retangulo (4,8));
		
		ArrayList<Espacial> espacial = new ArrayList();
		
		espacial.add(new Cubo (2,4));
		espacial.add(new Cilindro (4,1));
		espacial.add(new Esfera (2,3));
		espacial.add(new Piramide (7,4));
	
		for (Plano plan : plano) {
			
			System.out.println(plan.area());
			System.out.println(plan.perimetro());
			
			if (plan instanceof Diagonal) {
				System.out.println(((Diagonal) plan).calcDiagonal());
			}
		}
		
		for (Espacial esp : espacial) {
			
			System.out.println(esp.volume());
		}
		
	}
	

}
