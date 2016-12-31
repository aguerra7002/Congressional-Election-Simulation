package simul;

import java.util.List;

import Calcuations.CalculationFactory;

public class District {

	String state;
	int number;
	boolean isDemocrat;
	double pvi;
	int party;
	double gerrymanderedRating;
	List<Boolean> history; //might use?
	
	public District(String state, int number, boolean isDemocrat, double pvi) {
		gerrymanderedRating = 0; //Default value
		this.state = state;
		this.number = number;
		this.isDemocrat = isDemocrat;
		this.pvi = pvi;
	}
	
	public void adjustPVI(double adjustment) {
		pvi += adjustment;
	}
	
	public void election(boolean didDemocratWin) {
		isDemocrat = didDemocratWin;
	}
	
	public void holdElection(double k1, double k2) {
		double p = CalculationFactory.generateProbability(k1, k2, pvi);
		if (Math.random() < p) {
			isDemocrat = false;
		} else {
			isDemocrat = true;
		}
	}
	
	public String toString() {
		if (number == 1) {
			return state + " 1st";
		} else if (number == 2) {
			return state + " 2nd";
		} else if (number == 3) {
			return state + " 3rd"; 
		} else {
			return state + " " + number + "th";
		}
		
	}
	public boolean getIsDemocrat() {
		return isDemocrat;
	}
	
	public void setParty(int party) {
		this.party = party;
	}
	
	public void setGerrymanderedRating(double rating) {
		gerrymanderedRating = rating;
	}
	
	public int getParty() {
		return party;
	}
	
	
}
