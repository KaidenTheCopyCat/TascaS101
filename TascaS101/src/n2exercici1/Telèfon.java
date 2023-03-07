package n2exercici1;

public class Telèfon {

	private String marca, model;

	public Telèfon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public void trucar(String numTelefon) {
		System.out.println("S’està trucant al número: "+ numTelefon);
	}
	
	public String toString() {
		return "Telèfon [marca=" + marca + ", model=" + model + "]";
	} 
	
}
