import java.util.ArrayList;

public class Geometria_espacial {

	public static void main(String[] args) {
		ArrayList<Plano> plano = new ArrayList();
		
		plano.add(new Quadrado (2));
		plano.add(new Triangulo (2,5));
		plano.add(new Losango (5,10));
		plano.add(new Retangulo (4,8));
	
		for (Plano plan : plano) {
			
			System.out.println(plan.area());
			System.out.println(plan.perimetro());
			
			if (plan instanceof Diagonal) {
				System.out.println(((Diagonal) plan).calcDiagonal());
			}
		}
		
	}
	

}
