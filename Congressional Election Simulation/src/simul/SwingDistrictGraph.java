package simul;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SwingDistrictGraph extends JPanel {
	
	DistrictManager dm;
	
	public SwingDistrictGraph() {
		dm = DistrictManager.getInstance();
		setSize(300, 300);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<District> d = dm.getDistricts();
		int demSolid = 0;
		int demLikely = 0;
		int demLean = 0;
		int swing = 0;
		int repLean = 0;
		int repLikely = 0;
		int repSolid = 0;
		for (int i = 0; i < d.size(); i++) {
			
			if (d.get(i).pvi <= -10){
				demSolid++;
			} else if (d.get(i).pvi <= -5){
				demLikely++;
			} else if (d.get(i).pvi <= -2) {
				demLean++;
			} else if (d.get(i).pvi >= 10) {
				repSolid++;
			} else if (d.get(i).pvi >= 5) {
				repLikely++;
			} else if (d.get(i).pvi >= 2) {
				repLean++;
			} else {
				swing++;
			}
		}
		int bottom = getHeight() - 40;
		g.drawLine(20, 20, 20, bottom);
		g.drawLine(20, bottom, getWidth() - 10, bottom);
		g.setColor(new Color(0,0,100));
		g.fillRect(30, bottom - (demSolid * 3), 20, demSolid * 3);
		g.setColor(new Color(0,0,175));
		g.fillRect(95, bottom - (demLikely * 3), 20, demLikely * 3);
		g.setColor(Color.BLUE);
		g.fillRect(160, bottom - (demLean * 3), 20, demLean * 3);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(225, bottom - (swing * 3), 20, swing * 3);
		g.setColor(Color.RED);
		g.fillRect(290, bottom - (repLean * 3), 20, repLean * 3);
		g.setColor(new Color(175, 0, 0));
		g.fillRect(355, bottom - (repLikely * 3), 20, repLikely * 3);
		g.setColor(new Color(100, 0, 0));
		g.fillRect(420, bottom - (repSolid * 3), 20, repSolid * 3);
		dm.setSwing(swing);
	}

}
