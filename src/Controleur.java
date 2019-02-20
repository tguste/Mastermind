import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Controleur implements ItemListener {

	
	Modele refModl;
	
	public Controleur(Modele m) {
		this.refModl = m;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() instanceof java.awt.Button) {
			this.refModl.proposer(liste_bouttons.getIndex(e.getItem()));	
		} 
	}
		
}
	


