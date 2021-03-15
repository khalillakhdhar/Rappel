package classes;

public class Personne {
private String nom,prenom;
private double poid,taille;

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public double getPoid() {
	return poid;
}
public void setPoid(double poid) {
	this.poid = poid;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public Personne(String nom, String prenom, double poid, double taille) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.poid = poid;
	this.taille = taille;
}
public Personne() {
	super();
}
@Override
public String toString() {
	return " [nom=" + nom + ", prenom=" + prenom + ", poid=" + poid + ", taille=" + taille + "]";
}



}
