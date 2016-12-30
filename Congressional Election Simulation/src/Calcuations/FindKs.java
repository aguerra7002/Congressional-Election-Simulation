package Calcuations;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FindKs {

	
	static double[] xVals = new double[8];
	static double[] yVals = new double[8];
	
	
	public static void main(String[] args) {
		double k1 = .1;
		double k2 = -3;
		double lowestSS = 10;
		double k1Val = 18;
		double k2Val = 19;
		getArrayVals();
		
		for(double i = k1; i < 2; i+=.0001) {
			for (double j = k2; j < 3; j+=.1) {
				double ss = 0;
				for(int k = 0; k < xVals.length; k++) {
					ss += Math.pow(yVals[k] - predictProbability(i, j, xVals[k]), 2);
				}
				if (ss < lowestSS) {
					lowestSS = ss;
					k1Val = i;
					k2Val = j;
				}
			}
		}
		System.out.println(k1Val + " " + k2Val + " " + lowestSS);
		for(int i = 0; i < 10; i+= 2) {
		}
		
				
	}
	
	public static double predictProbability(double k1, double k2, double x) {
		double prob = 1/(1+Math.pow(Math.E, -k1 * (x + k2)));
		return prob;
	}
	
	private static void getArrayVals() {
		String csvFile = "/Users/Janine/Documents/regression.csv";
	      BufferedReader br = null;
	      String line = "";
	      String cvsSplitBy = ",";
	      ArrayList<Point> l = new ArrayList<Point>();
	      try {

	          br = new BufferedReader(new FileReader(csvFile));
	          int i = 0;
	          
	          while ((line = br.readLine()) != null) {
	        	  //System.out.println(br.readLine());
	             
	              // use comma as separator
	            String[] coord = line.split(cvsSplitBy);
	            	  
	            double x = Double.parseDouble(coord[0]);
	            double y = Double.parseDouble(coord[12]);
	            xVals[i] = x;
	            yVals[i] = y;
	            i++;
	          }

	      } catch (FileNotFoundException e) {
	          e.printStackTrace();
	      } catch (IOException e) {
	          e.printStackTrace();
	      } finally {
	          if (br != null) {
	              try {
	                  br.close();
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	      }
	      
	      
	   }
}
