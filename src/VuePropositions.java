import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VuePropositions extends Canvas  {

	public static final int JX_Y=10;
	public static final int ECART=60;
	
	public static final int CX=250;
	public static final int CY=8;
	
	public final static int RJ=45;
	public final static int RC=15;
	
	public VuePropositions() {
		super();
		this.setSize(Modele.DIFFICULTE*75,Modele.N_TENTATIVE*70);
		this.setBackground(Color.GRAY);
		
		
	}
	public void paint(Graphics g) {
		int a=0;
		for (int i =0; i<10;i++) {
			g.drawOval(JX_Y,(JX_Y*i)+a,RJ, RJ);
			a+=ECART;
			}
		
		
		
		/*
		g.drawOval(10, 10, 45, 45);
		g.drawOval(10, 70, 45, 45);
		g.drawOval(10, 130, 45, 45);
		g.drawOval(10, 190, 45, 45);
		g.drawOval(10, 250, 45, 45);
		g.drawOval(10, 310, 45, 45);
		g.drawOval(10, 370, 45, 45);
		g.drawOval(10, 430, 45, 45);
		g.drawOval(10, 490, 45, 45);
		g.drawOval(10, 550, 45, 45);
		
	
		g.drawOval(70, 10, 45, 45);
		g.drawOval(130, 10, 45, 45);
		g.drawOval(190, 10, 45, 45);
		
		g.drawOval(250, 8, 15, 15);
		g.drawOval(250, 30, 15, 15);
		g.drawOval(275, 8, 15, 15);
		g.drawOval(275, 30, 15, 15);
		*/
		
	
	

}
