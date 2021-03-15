package classes;

public class Personne {
private String nom,prenom;
private float poid,taille;
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
public float getPoid() {
	return poid;
}
public void setPoid(float poid) {
	this.poid = poid;
}
public float getTaille() {
	return taille;
}
public void setTaille(float taille) {
	this.taille = taille;
}
public Personne(String nom, String prenom, float poid, float taille) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.poid = poid;
	this.taille = taille;
}
public Personne() {
	super();
}

}
