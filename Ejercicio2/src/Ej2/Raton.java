package Ej2;

public class Raton {

	private double peso;
	private double velocidad;
	private int posActual;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double cantGramos) {
		peso = cantGramos;
	}
	
	public double getVelocidad() {
		setVelocidad();
		return velocidad;
	}
	
	public void setVelocidad() {
		velocidad = 10 - peso;
	}
	
	public int getPosActual() {
		return posActual;
	}
	
	public void setPosActual(int kilometro) {
		posActual = kilometro;
	}
	
}
