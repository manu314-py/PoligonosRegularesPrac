package poligonos;

public class Cuadrado {
	
	public static final String COLOR_NEGRO = "Negro you are racist";
	public static final String COLOR_VERDE = "Verde";
	public static final String COLOR_ROJO = "Rojo";
	public static final String COLOR_AZUL = "Azul";
	
	
	private String color;
	private float longitud;
	private boolean estaRelleno;
	private boolean estaRotado;
	private float gradosRotacion;
	
	public Cuadrado(float longitud, boolean estaRelleno) {
		color = COLOR_NEGRO;
		this.longitud = longitud;
		this.estaRelleno = estaRelleno;
	}
	
	public Cuadrado(String color, float longitud, boolean estaRelleno) {
		this.color = color;
		this.longitud = longitud;
		this.estaRelleno = estaRelleno;
	}
	
	public float obtenerPerimetro() {
		return longitud * 4;
	}
	
	public float obtenerSuperficie() {
		return longitud * longitud;
	}
	
	public void rotar(float grados) {
		estaRotado = true;
		if(estaRotado) {
			gradosRotacion += grados;
		}
	}
	
	public void dibujar() {
		System.out.println("Dibujando...");
	}
	
	public void agrandar(float centimetros) {
		longitud += centimetros;
	}
	
	public void reducir(float centimetros) {
		if(longitud - centimetros < 0) {
			System.out.println("Error, la longitud no puede ser menor que 0");
		}else {
			longitud -= centimetros;
		}
	}
	
	public void rellenar() {
		estaRelleno = true;
	}
}
