package modelo;

public class Cuadrado {
	
	private int lado;
	
	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int calcularArea(int lado){
		int resultado=lado*lado;
		return resultado;
	}
	public int calcularPerimetro(int lado){
		int resultado=lado*4;
		return resultado;
	}
}
