package simul;

import java.awt.Color;
import java.awt.Font;
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
		g.drawString("Frequency of Districts in Each PVI Category", 100, 20);
		g.drawString("0", 10, bottom + 4);
		g.drawLine(18, bottom - 120, 22, bottom - 120); // 40 districts
		g.drawString("40", 2, bottom - 116);
		g.drawLine(18, bottom - 240, 22, bottom - 240); // 40 districts
		g.drawString("80", 2, bottom - 236);
		g.drawLine(20, bottom - 360, 22, bottom - 360); // 40 districts
		g.drawString("120", 0, bottom - 356);
		g.drawLine(22, 20, 22, bottom);
		g.drawLine(18, bottom, getWidth() - 10, bottom);
		g.setColor(new Color(0,0,100));
		g.fillRect(30, bottom - (demSolid * 3), 20, demSolid * 3);
		g.drawString(demSolid + "", 30, bottom - (demSolid * 3) - 2);
		g.setColor(new Color(0,0,175));
		g.fillRect(95, bottom - (demLikely * 3), 20, demLikely * 3);
		g.drawString(demLikely + "", 95, bottom - (demLikely * 3) - 2);
		g.setColor(Color.BLUE);
		g.fillRect(160, bottom - (demLean * 3), 20, demLean * 3);
		g.drawString(demLean + "", 160, bottom - (demLean * 3) - 2);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(225, bottom - (swing * 3), 20, swing * 3);
		g.drawString(swing + "", 225, bottom - (swing * 3) - 2);
		g.setColor(Color.RED);
		g.fillRect(290, bottom - (repLean * 3), 20, repLean * 3);
		g.drawString(repLean + "", 290, bottom - (repLean * 3) - 2);
		g.setColor(new Color(175, 0, 0));
		g.fillRect(355, bottom - (repLikely * 3), 20, repLikely * 3);
		g.drawString(repLikely + "", 355, bottom - (repLikely * 3) - 2);
		g.setColor(new Color(100, 0, 0));
		g.fillRect(420, bottom - (repSolid * 3), 20, repSolid * 3);
		g.drawString(repSolid + "", 420, bottom - (repSolid * 3) - 2);
		g.setColor(Color.BLACK);
		g.drawString("Solid", 22, bottom + 12);
		g.drawString("Likely", 89, bottom + 12);
		g.drawString("Lean", 154, bottom + 12);
		g.drawString("Swing", 217, bottom + 12);
		g.drawString("Lean", 284, bottom + 12);
		g.drawString("Likely", 349, bottom + 12);
		g.drawString("Solid", 412, bottom + 12);
		g.drawString("Democrat <", 22, bottom + 32);
		g.drawLine(82, bottom + 27 , 383, bottom + 27);
		g.drawString("> Republican", 380, bottom + 32);
		
		dm.setSwing(swing);
	}

}
