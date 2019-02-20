import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable{
	
	public static final Color[] COULEUR = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	public static final int N_TENTATIVE = 10;
	public static final int DIFFICULTE = 4;
	enum etat{EN_COURS,GAGNE,PERDU};
	
	Range proposition;
	int tentative;
	
	public Modele() {
		tentative = 0;
	}
	
	public void proposer(int bouton) {
		this.proposition.remplir(this.COULEUR[bouton]);
		this.setChanged();
		this.notifyObservers();
	}

}
