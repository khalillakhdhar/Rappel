package classes;

public class Calcules {
	private String dateheure;
	private String etat;
	private Personne p;
	public String getDateheure() {
		return dateheure;
	}
	public void setDateheure(String dateheure) {
		this.dateheure = dateheure;
	}
	public String getEtat() {
		return etat;
	}
	
	
	
	public Calcules(Personne p) {
		super();
		this.p = p;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Calcules() {
		super();
	}
	 int indice()
	{
	return (int) Math.round(p.getPoid()/Math.pow(p.getTaille(),2));
		
	}
	 String interpretation()
	{
		if(indice()<20)
		return "vous êtes maigre";
		else if(indice() <25)
			return "vous êtes idéal";
		else
		return " vous êtes en surpoids";
	}
	public String toString() {
		return "Calcules [Teste pour : "+p.toString() + " IMC=" + indice() + ", etat=" + this.interpretation() + "]";
	}
	
	
}
