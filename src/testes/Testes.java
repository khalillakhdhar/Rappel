package testes;

import classes.Calcules;
import classes.Personne;

public class Testes {
public static void main(String args[])
{
	Personne p=new Personne("Ali","Ben Ahmed",84, 1.89);
	Calcules c=new Calcules(p);
	System.out.println(c.toString());	

}
}
