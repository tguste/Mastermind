import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VueClavier extends Panel{
	
	
	
	
	public VueClavier(ActionListener a) {
		super();
		this.setBackground(Color.white);
		Button b = new Button();
		ArrayList<Button> liste_bouttons= new ArrayList<Button>();
		for (int i = 0; i<Modele.COULEUR.length;i++) {
			b.setBackground(Modele.COULEUR[i]);
			b.setSize(200,200);
			liste_bouttons.add(b);
			liste_bouttons.get(i).addActionListener(a);
			this.add(liste_bouttons.get(i));
			
		}			
	}

}
