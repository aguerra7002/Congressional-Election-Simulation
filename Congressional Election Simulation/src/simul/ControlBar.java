package simul;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlBar extends JPanel implements ActionListener{
	
	int year;
	
	JLabel yearLabel;
	JButton run;
	JTextField k;
	JLabel kLabel;
	DistrictManager dm;
	Main m;
	
	public ControlBar(int beginYear, Main m) {
		this.m = m;
		year = beginYear;
		yearLabel = new JLabel("Year: " + year);
		run = new JButton("Simulate Next Election Cycle");
		kLabel = new JLabel("Current K-Value");
		k = new JTextField(15);
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		JPanel yearPane = new JPanel();
		yearPane.add(yearLabel);
		add(yearPane, c);
		
		c.gridx = 1;
		JPanel runPane = new JPanel();
		runPane.add(run);
		add(runPane, c);
		
		c.gridx = 2;
		JPanel kPane = new JPanel();
		kPane.add(kLabel);
		kPane.add(k);
		add(kPane, c);
		
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		run.addActionListener(this);
		dm = DistrictManager.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == run) {
			nextElection();
		}
	}
	
	private void nextElection() {
		year+=2;
		yearLabel.setText("Year: " + year + "");
		dm.holdElection(year);
		k.setText(dm.getK() + "");
		m.updateComponents();
		
	}
}
