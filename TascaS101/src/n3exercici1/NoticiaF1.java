package n3exercici1;

public class NoticiaF1 extends Noticia {

	//a quina escuderia(String) fan referència
	
	String escuderia;

	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
		
		setPreu(calcularPreuNoticia());
		setPuntuació(calcularPuntuacioNoticia());
	}


	public float calcularPreuNoticia() {
		
		/*
		 * Notícies d'F1: 
		 * Preu inicial: 100 €
		 * Ferrari o Mercedes: 50 €

		 */
		float preuFinal = 100;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			preuFinal += 50;
		}
		return preuFinal;
	
	}


	public int calcularPuntuacioNoticia() {
		/*
		 * Notícies F1: 4 punts
		 * Ferrari o Mercedes: 2 punts
		 */
		int puntuacioFinal=4;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			puntuacioFinal+=2;
		}
		return puntuacioFinal;
	}


	public String toString() {
		return super.toString()+"NoticiaF1 [equip=" + escuderia + "]";
	}
	
	

}
