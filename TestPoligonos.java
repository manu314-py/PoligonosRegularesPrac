package poligonos;

public class TestPoligonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado(Cuadrado.COLOR_AZUL,5, true);
		Triangulo t1 = new Triangulo(5, true, 3);
		
		c1.dibujar();
		System.out.println(c1.obtenerSuperficie());
		
		System.out.println(t1.obtenerSuperficie());
		Hexagono h1 = new Hexagono();
	}

}
