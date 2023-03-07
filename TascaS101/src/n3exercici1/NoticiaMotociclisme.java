package n3exercici1;

public class NoticiaMotociclisme extends Noticia {

	// de quin equip(String)
	
	String equip;	
	
	public NoticiaMotociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;

		setPreu(calcularPreuNoticia());
		setPuntuació(calcularPuntuacioNoticia());
	}


	public float calcularPreuNoticia() {
		
		/*
		 * Notícies de motociclisme: 
		 * Preu inicial: 100 €
		 * Honda o Yamaha: 50 €
		 */
		float preuFinal = 100;


		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
			preuFinal += 50;
		}
		return preuFinal;
	
	}


	public int calcularPuntuacioNoticia() {
		/*
		 * Notícies de Motociclisme: 3 punts
		 * Honda o Yamaha: 3 punts
		 */
		
		int puntuacioFinal=3;

		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
			puntuacioFinal+=3;
		}
		return puntuacioFinal;
	}


	public String toString() {
		return super.toString()+"NoticiaMotociclisme [equip=" + equip + "]";
	}

	
	
}
