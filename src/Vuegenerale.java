import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vuegenerale extends Frame implements WindowListener, ActionListener {
	
	
	public static void main(String[] args) {
		new Vuegenerale();
	}
	
	public Vuegenerale() {
		this.setLayout(new BorderLayout());
		VuePropositions vp = new VuePropositions();
		this.add(vp,BorderLayout.CENTER);
		
		VueClavier vc = new VueClavier(this);
		this.add(vc,BorderLayout.SOUTH);
		
		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.pack();
		this.setVisible(true);
		
	}
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
