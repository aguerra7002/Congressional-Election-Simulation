package simul;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	DistrictManager dm;
	SwingDistrictGraph sdg;
	HouseGraph hg;
	ControlBar cb;

	public Main(String name) {
		super(name);
		setSize(1000,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//Layout Stuff Here
		dm = DistrictManager.getInstance();
		dm.initializeDistricts();
		
		sdg = new SwingDistrictGraph();
		hg = new HouseGraph();
		cb = new ControlBar(2012, this);
		
		c.gridy = 0; 
		c.gridx = 0;
		c.weightx = .5;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		add(sdg, c);
		
		c.gridx = 1;
		add(hg, c);
		
		
		c.gridx = 0;
		c.gridwidth = 2;
		c.gridy = 1;
		c.weighty = .05;
		c.anchor = GridBagConstraints.SOUTH;
		add(cb, c);
		
		setVisible(true);
	}
	
	public void updateComponents() {
		hg.repaint();
		sdg.repaint();
	}
	
	public static void main(String[] args) {
		new Main("Congressional Election Simulator");
	}
}
