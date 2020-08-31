package Ej1;

public class Lobo {
	
	private int calorias;
	
	public int getCalorias() {
		return calorias;
	}
	
	public void setCalorias(int cantCalorias) {
		calorias = cantCalorias;
	}
	
	public void comerChanchito(int pesoChanchito) {
		calorias += (pesoChanchito / 10);
	}
	
	public boolean estaGordo() {
		boolean gordo = true;
		if (calorias>200) {
			System.out.println("El lobo Yamilo está gordo");
		}else {
			System.out.println("El lobo Yamilo no está gordo");
			gordo = false;
		}
		return gordo;
	}
	
	public boolean estaSaludable() {
		boolean saludable = true;
		if (calorias>20 & calorias<200) {
			System.out.println("El lobo Yamilo está saludable");
		}else {
			System.out.println("El lobo Yamilo no está saludable");
			saludable = false;
		}
		return saludable;
	}
	
	public void correr(int minutos) {
		calorias -= (2*minutos);
	}
}
