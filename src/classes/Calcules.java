package classes;

public class Calcules {
	private String dateheure;
	private String etat;
	public String getDateheure() {
		return dateheure;
	}
	public void setDateheure(String dateheure) {
		this.dateheure = dateheure;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Calcules() {
		super();
	}
	public int indice(Personne p)
	{
	return (int) Math.round(p.getPoid()/Math.pow(p.getTaille(),2));
		
	}

}
