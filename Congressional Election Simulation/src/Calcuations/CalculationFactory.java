package Calcuations;

public class CalculationFactory {

	//Switch to False to idealize the situation
	private static boolean actual = false;
	private static double oldK2Val = 1.2;
	
	public static double getK1Val(int year) {
		//K-predictor function goes here
		int modifiedYear = year - 1988;
		double k;
		double randomFactor = Math.pow((Math.random()/2),2);
		final double B_CONST_CONGRESSIONAL = .4;
		final double B_CONST_PRESIDENTIAL = .6;
		/******ACTUAL*******/
		if (actual) {
			final double A_CONST = .02;
			if (year % 4 == 2) {
			//Congressional
				k = ((A_CONST * Math.pow(modifiedYear, .5)) + B_CONST_CONGRESSIONAL);
				k += randomFactor;
			} else if (year % 4 == 0) {
				k = ((A_CONST * Math.pow(modifiedYear, .5)) + B_CONST_PRESIDENTIAL);
				k += randomFactor; 
			} else {
				k = Integer.MAX_VALUE;
			}
		}
/////////////////////////////////////////////////////////////////		
		/******IDEALIZED*******/
		else {
			final double A_CONST = -.02;
			if (year % 4 == 2) {
				k = ((A_CONST * Math.pow(modifiedYear / 2, .5)) + B_CONST_CONGRESSIONAL);
				k+= randomFactor;
			} else if (year % 4 == 0) {
				k = ((A_CONST * Math.pow(modifiedYear, .5)) + B_CONST_PRESIDENTIAL);
				k+= randomFactor;
			} else {
				k = Integer.MIN_VALUE;
			}
		}
////////////////////////////////////////////////////////////////		
		
		return k;
	}
	
	public static double getK2Val(int year) {
		//K-predictor function goes here
		double k = oldK2Val + (Math.floor(Math.random() * 7) - 3) / 10;
		if(k < -3 ) {
			k++;
		} else if (k > 3) {
			k--;
		}
		oldK2Val = k;
		// Randomly leans country dem or rep based on year to year happenings.
		//Don't know why year is parameterized
		return k;
	}
	
	public static double generateProbability(double k1, double k2, double pvi) {
		//logistic function goes here
		double probability = 1d/(1d + Math.pow(Math.E, -k1 * (pvi + k2)));
		return probability;
	}
	
	public static double getPVIAdjustment(double pvi) {
		double adjustment;
		if (!actual) {
			adjustment = -1 * pvi / 50;
			double randoFactor = (Math.random() * 3) - 1;
			adjustment *= randoFactor;
		//Add some randomness to PVI Adjustments here
		} else {
			adjustment = 0;
			double randoFactor = (Math.random() * 4) - 2;
			adjustment = randoFactor;
		}
		return adjustment;
	}
}
