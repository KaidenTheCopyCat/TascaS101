package n2exercici1;

public class Smartphone extends Telèfon implements Camera, Rellotge {

	public Smartphone(String marca, String model) {
		super(marca, model);
	}

	public void alarma() {
		System.out.println("Està sonant l’alarma");

	}

	public void fotografiar() {
		System.out.println("S’està fent una foto");

	}

}
