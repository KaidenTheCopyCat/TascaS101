package n3exercici1;

public class NoticiaBasquet extends Noticia {

	//quina competició fa referència(String) i a quin club(String)
	
	String competicio, club;
	
	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;

		setPreu(calcularPreuNoticia());
		setPuntuació(calcularPuntuacioNoticia());
	}



	public float calcularPreuNoticia() {
		/*
		 * Preu inicial: 250 €
		 * Eurolliga: 75 €
		 * Barça o Madrid: 75 €
		 */
		float preuFinal = 250;

		if (competicio.equalsIgnoreCase("Eurolliga")) {
			preuFinal += 75;
		}
		if (club.equalsIgnoreCase("barca") || club.equalsIgnoreCase("madrid")) {
			preuFinal += 75;
		}
		return preuFinal;
	}


	public int calcularPuntuacioNoticia() {
		/*
		 * Notícies de bàsquet: 4 punts 
		 * Eurolliga: 3 punts 
		 * ACB: 2 punts
		 * Barça o Madrid: 1 punt
		 */
		int puntuacioFinal=4;
		
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			puntuacioFinal+=3;
		}else if (competicio.equalsIgnoreCase("ACB")) {
			puntuacioFinal+=2;
		}
		
		if (club.equalsIgnoreCase("barca") || club.equalsIgnoreCase("madrid")) {
			puntuacioFinal+=1;
		}
		return puntuacioFinal;
	}


	public String toString() {
		return super.toString()+"NoticiaBasquet [competicio=" + competicio + ", club=" + club + "]";
	}

	
	
}
