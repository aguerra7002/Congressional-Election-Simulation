package simul;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class HouseGraph extends JPanel {

	DistrictManager dm;
	public HouseGraph() {
		setSize(300, 300);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		dm = DistrictManager.getInstance();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<District> d = dm.getDistricts();
		int dem = 0; 
		int rep = 0;
		for (int i = 0; i < d.size(); i++) {
			
			if (d.get(i).isDemocrat){
				g.setColor(Color.BLUE);
				dem++;
			} else {
				g.setColor(Color.RED);
				rep++;
			}
			int width = getWidth() - 12;
			int x = (i % width)* 20 % width;
			int y = ((i*20)/width) * 20;
			g.fillOval(x + 5, y + 5, 20, 20);
		}
		g.drawString("Democrat Seats: " + dem + "  Republican Seats: " + rep, 5, getHeight() - 20);
		System.out.println(dm.getYear() + "\t" + dem + "\t" + rep + "\t" + dm.getYear() + "\t" + dm.getK() + "\t" + dm.getYear() + "\t" + dm.getSwing() + "\t" + dm.getYear() + "\t" + dm.getNumSwitched());
	}

}