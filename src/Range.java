import java.awt.Color;

public class Range {	
	Color[] jeton = new Color[Modele.DIFFICULTE];
	int indiceJeton;
	int[] blancNoir = new int[2];
	
	
	public void remplir(Color c) {
		this.jeton[this.indiceJeton] = c;
		this.indiceJeton += 1;
		
	}
	
}
