package n3exercici1;

public abstract class Noticia {

	String titular, text;	
	int puntuacio;
	float preu;
	
	public Noticia(String titular) {
		this.titular = titular;
		text = "";
		puntuacio = 0;
		preu = 0;
	}

	public String getTitular() {
		return titular;
	}

	public String getText() {
		return text;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public float getPreu() {
		return preu;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setPuntuació(int puntuació) {
		this.puntuacio = puntuació;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String toString() {
		return "Notícia [titular=" + titular + ", text=" + text + ", puntuació=" + puntuacio + ", preu=" + preu + "]";
	}
	
	public abstract float calcularPreuNoticia();
	
	public abstract int calcularPuntuacioNoticia();
	
	
}
