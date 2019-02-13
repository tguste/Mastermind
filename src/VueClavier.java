import java.awt.Button;
import java.awt.Color;
import java.awt.List;
import java.awt.Panel;
import java.util.ArrayList;

public class VueClavier extends Panel{
	
	ArrayList<Button> liste_bouttons= new ArrayList<Button>();
	private  Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	
	public VueClavier() {
		super();
		this.setBackground(Color.white);
		Button b = new Button();
		for (int i = 0; i<COULEURS.length;i++) {
			b.setBackground(COULEURS[i]);
			liste_bouttons.add(b);;
			
		}
		
		
	}

}
