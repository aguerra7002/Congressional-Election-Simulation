package Calcuations;

import simul.District;
import simul.DistrictManager;

public class MarkovMiniSim {

	private static final int DEMOCRAT = 0;
	private static final int REPUBLICAN = 1;
	private static final int INDEPENDENT = 2;
	
	public static void main(String[] args) {
		int stoppingYear = 2114;
		DistrictManager dm = new DistrictManager();
		dm.initializeDistricts();
		int year = 2012;
		for(District d: dm.getDistricts()) {
			if (d.getIsDemocrat()) {
				d.setParty(DEMOCRAT);
			} else {
				d.setParty(REPUBLICAN);;
			}
		}
		
		for(int i = year; i < stoppingYear; i+=2) {
			int dem = 0;
			int rep = 0;
			int ind = 0;
			for(District d: dm.getDistricts()) {
				d.setParty(markovChain(d.getParty())); 
				if (d.getParty() == DEMOCRAT) {
					dem++;
				} else if (d.getParty() == REPUBLICAN) {
					rep++;
				} else {
					ind++;
				}
			}
			System.out.println(i + "\t" + dem + "\t" + rep + "\t" + ind);
		}
		
		
		
	}
	
	private static int markovChain(int currentParty) {
		double r = Math.random();
		int newParty;
		if(currentParty == DEMOCRAT) {
			if (r <= .93720202) {
				newParty = DEMOCRAT;
			} else if(r >= 1 - .06252554) {
				newParty = REPUBLICAN;
			} else {
				newParty = INDEPENDENT;
			}
		} else if (currentParty == REPUBLICAN) {
			if (r <= .08125658) {
				newParty = DEMOCRAT;
			} else if(r >= 1 - .91821701) {
				newParty = REPUBLICAN;
			} else {
				newParty = INDEPENDENT;
			}
		} else {
			if (r <= .30769231) {
				newParty = DEMOCRAT;
			} else if(r >= 1 - .15384615) {
				newParty = REPUBLICAN;
			} else {
				newParty = INDEPENDENT;
			}
		}
		return newParty;
	}
}
