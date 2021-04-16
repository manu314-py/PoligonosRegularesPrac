package poligonos;

public class Triangulo{
	
	public static final String COLOR_NEGRO = "Negro";
	public static final String COLOR_VERDE = "Verde";
	public static final String COLOR_ROJO = "Rojo";
	public static final String COLOR_AZUL = "Azul";
	
	private float altura;
	private float base;
	private String color;
	private boolean estaRelleno;
	
	public Triangulo(float base, boolean estaRelleno, float altura) {
		this.base = base;
		this.estaRelleno = estaRelleno;
		this.altura = altura;
		this.color = COLOR_NEGRO;
	}
	
	public Triangulo(String color, float base, boolean estaRelleno, float altura) {
		this.color = color;
		this.base = base;
		this.estaRelleno = estaRelleno;
		this.altura = altura;
	}
	
	public float obtenerPerimetro() {
		return base * 3;
	}
	
	public float obtenerSuperficie() {
		return base * altura;
	}
}
