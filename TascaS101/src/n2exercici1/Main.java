package n2exercici1;

public class Main {

	public static void main(String[] args) {

		Smartphone smartphone = new Smartphone("Samsung", "A52");
		
		smartphone.trucar("+34 935551300"); // crida el metode desde la class smarphone que l'hereda de Telefon		
		smartphone.alarma(); // crida el metode desde class smartphone que implementa el metode de l'interficie Rellotge
		smartphone.fotografiar(); // mateix que l'anterior pero el metode ve de l'interfice camera

	}

}
