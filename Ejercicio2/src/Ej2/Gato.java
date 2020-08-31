package Ej2;

public class Gato {

	private double energia;
	private double velocidad;
	private int posActual;
	
	public double getEnergia() {
		return energia;
	}
	
	public void setEnergia(double cantEnergia) {
		energia = cantEnergia;
	}
	
	public double getVelocidad() {
		setVelocidad();
		return velocidad;
	}
	
	public void setVelocidad() {
		velocidad = 5 + (energia/10);
	}
	
	public int getPosActual() {
		return posActual;
	}
	
	public void setPosActual(int kilometro) {
		posActual = kilometro;
	}
	
	
	public boolean atraparRaton(double velGato, double velRaton) {
		if(velGato>velRaton) {
			System.out.println("Tom atrapó a Jerry");
			return true;
		}else {
			System.out.println("Tom no pudo atrapar a Jerry");
			return false;
		}
	}
	
	public void correrRaton(int posicionGato, int posicionRaton) {
		setVelocidad();
		energia = energia - (0.5 * velocidad*(posicionRaton - posicionGato));
		posActual = posicionRaton;
	}
	
	
	
}
