package simul;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Calcuations.CalculationFactory;

public class DistrictManager {
	
	private static DistrictManager dm = new DistrictManager();
	private int year;
	private double k;
	private int numSwitched;
	private int swingStates;

	ArrayList<District> d = new ArrayList<District>();
	
	public void initializeDistricts() {
		d.add(new District("Alabama", 1, false, 15));
		d.add(new District("Alabama", 2, false, 17));
		d.add(new District("Alabama", 3, false, 16));
		d.add(new District("Alabama", 4, false, 28));
		d.add(new District("Alabama", 5, false, 17));
		d.add(new District("Alabama", 6, false, 28));
		d.add(new District("Alabama", 7, true, -20));
		d.add(new District("Alaska", 1, false, 12));
		d.add(new District("Arizona", 1, true, 4));
		d.add(new District("Arizona", 2, false, 3));
		d.add(new District("Arizona", 3, true, -8));
		d.add(new District("Arizona", 4, false, 20));
		d.add(new District("Arizona", 5, false, 17));
		d.add(new District("Arizona", 6, false, 12));
		d.add(new District("Arizona", 7, true, -16));
		d.add(new District("Arizona", 8, false, 15));
		d.add(new District("Arizona", 9, true, 1));
		d.add(new District("Arkansas", 1, false, 14));
		d.add(new District("Arkansas", 2, false, 8));
		d.add(new District("Arkansas", 3, false, 19));
		d.add(new District("Arkansas", 4, false, 15));
		d.add(new District("California", 1, false, 10));
		d.add(new District("California", 2, true, -20));
		d.add(new District("California", 3, true, -3));
		d.add(new District("California", 4, false, 10));
		d.add(new District("California", 5, true, -19));
		d.add(new District("California", 6, true, -18));
		d.add(new District("California", 7, true, 0));
		d.add(new District("California", 8, false, 10));
		d.add(new District("California", 9, true, -6));
		d.add(new District("California", 10, false, 1));
		d.add(new District("California", 11, true, -17));
		d.add(new District("California", 12, true, -34));
		d.add(new District("California", 13, true, -37));
		d.add(new District("California", 14, true, -23));
		d.add(new District("California", 15, true, -16));
		d.add(new District("California", 16, true, -7));
		d.add(new District("California", 17, true, -20));
		d.add(new District("California", 18, true, -18));
		d.add(new District("California", 19, true, -19));
		d.add(new District("California", 20, true, -21));
		d.add(new District("California", 21, false, -2));
		d.add(new District("California", 22, false, 10));
		d.add(new District("California", 23, false, 16));
		d.add(new District("California", 24, true, -4));
		d.add(new District("California", 25, false, 3));
		d.add(new District("California", 26, true, -4));
		d.add(new District("California", 27, true, -11));
		d.add(new District("California", 28, true, -20));
		d.add(new District("California", 29, true, -25));
		d.add(new District("California", 30, true, -14));
		d.add(new District("California", 31, true, -5));
		d.add(new District("California", 32, true, -12));
		d.add(new District("California", 33, true, -11));
		d.add(new District("California", 34, true, -30));
		d.add(new District("California", 35, true, -15));
		d.add(new District("California", 36, true, 1));
		d.add(new District("California", 37, true, -34));
		d.add(new District("California", 38, true, -12));
		d.add(new District("California", 39, false, 5));
		d.add(new District("California", 40, true, -29));
		d.add(new District("California", 41, true, -9));
		d.add(new District("California", 42, false, 10));
		d.add(new District("California", 43, true, -26));
		d.add(new District("California", 44, true, -32));
		d.add(new District("California", 45, false, 7));
		d.add(new District("California", 46, true, 9));
		d.add(new District("California", 47, true, 8));
		d.add(new District("California", 48, false, 7));
		d.add(new District("California", 49, false, 4));
		d.add(new District("California", 50, false, 14));
		d.add(new District("California", 51, true, -16));
		d.add(new District("California", 52, true, -2));
		d.add(new District("California", 53, true, -10));
		d.add(new District("Colorado", 1, true, -18));
		d.add(new District("Colorado", 2, true, -8));
		d.add(new District("Colorado", 3, false, 5));
		d.add(new District("Colorado", 4, false, 11));
		d.add(new District("Colorado", 5, false, 13));
		d.add(new District("Colorado", 6, false, -1));
		d.add(new District("Colorado", 7, true, -5));
		d.add(new District("Connecticut", 1, true, -13));
		d.add(new District("Connecticut", 2, true, -6));
		d.add(new District("Connecticut", 3, true, -11));
		d.add(new District("Connecticut", 4, true, -5));
		d.add(new District("Connecticut", 5, true, -3));
		d.add(new District("Delaware", 1, true, -8));
		d.add(new District("Florida", 1, false, 21));
		d.add(new District("Florida", 2, true, 6));
		d.add(new District("Florida", 3, false, 14));
		d.add(new District("Florida", 4, false, 19));
		d.add(new District("Florida", 5, true, -21));
		d.add(new District("Florida", 6, false, 9));
		d.add(new District("Florida", 7, false, 4));
		d.add(new District("Florida", 8, false, 9));
		d.add(new District("Florida", 9, true, -8));		
		d.add(new District("Florida", 10, false, 6));
		d.add(new District("Florida", 11, false, 1));
		d.add(new District("Florida", 12, false, 7));
		d.add(new District("Florida", 13, false, 1));
		d.add(new District("Florida", 14, true, -13));
		d.add(new District("Florida", 15, false, 6));
		d.add(new District("Florida", 16, false, 6));
		d.add(new District("Florida", 17, false, 10));
		d.add(new District("Florida", 18, true, 3));
		d.add(new District("Florida", 19, false, 12));
		d.add(new District("Florida", 20, true, -29));
		d.add(new District("Florida", 21, true, -10));
		d.add(new District("Florida", 22, true, -3));
		d.add(new District("Florida", 23, true, -9));
		d.add(new District("Florida", 24, true, -34));
		d.add(new District("Florida", 25, false, 5));
		d.add(new District("Florida", 26, false, 1));
		d.add(new District("Florida", 27, false, 2));
		d.add(new District("Georgia", 1, false, 9));
		d.add(new District("Georgia", 2, true, -6));
		d.add(new District("Georgia", 3, false, 19));
		d.add(new District("Georgia", 4, true, 21));
		d.add(new District("Georgia", 5, true, 32));
		d.add(new District("Georgia", 6, false, 14));
		d.add(new District("Georgia", 7, false, 14));
		d.add(new District("Georgia", 8, false, 15));
		d.add(new District("Georgia", 9, false, 30));
		d.add(new District("Georgia", 10, false, 14));
		d.add(new District("Georgia", 11, false, 19));
		d.add(new District("Georgia", 12, false, 9));
		d.add(new District("Georgia", 13, true, -16));
		d.add(new District("Georgia", 14, false, 26));
		d.add(new District("Hawaii", 1, true, -18));
		d.add(new District("Hawaii", 2, true, -21));
		d.add(new District("Idaho", 1, false, 18));
		d.add(new District("Idaho", 2, false, 17));
		d.add(new District("Illinois", 1, true, -28));
		d.add(new District("Illinois", 2, true, -29));
		d.add(new District("Illinois", 3, true, -5));
		d.add(new District("Illinois", 4, true, -29));
		d.add(new District("Illinois", 5, true, -16));
		d.add(new District("Illinois", 6, false, 4));
		d.add(new District("Illinois", 7, true, -36));
		d.add(new District("Illinois", 8, true, -8));
		d.add(new District("Illinois", 9, true, -15));
		d.add(new District("Illinois", 10, false, -8));
		d.add(new District("Illinois", 11, true, -8));
		d.add(new District("Illinois", 12, false, 0));
		d.add(new District("Illinois", 13, false, 0));
		d.add(new District("Illinois", 14, false, 5));
		d.add(new District("Illinois", 15, false, 14));
		d.add(new District("Illinois", 16, false, 4));
		d.add(new District("Illinois", 17, true, -7));
		d.add(new District("Illinois", 18, false, 11));
		d.add(new District("Indiana", 1, true, -10));
		d.add(new District("Indiana", 2, false, 6));
		d.add(new District("Indiana", 3, false, 13));
		d.add(new District("Indiana", 4, false, 11));
		d.add(new District("Indiana", 5, false, 9));
		d.add(new District("Indiana", 6, false, 12));
		d.add(new District("Indiana", 7, true, -13));
		d.add(new District("Indiana", 8, false, 8));
		d.add(new District("Indiana", 9, false, 9));
		d.add(new District("Iowa", 1, false, -5));
		d.add(new District("Iowa", 2, true, -4));
		d.add(new District("Iowa", 3, false, 0));
		d.add(new District("Iowa", 4, false, 5));
		d.add(new District("Kansas", 1, false, 23));
		d.add(new District("Kansas", 2, false, 8));
		d.add(new District("Kansas", 3, false, 6));
		d.add(new District("Kansas", 4, false, 14));
		d.add(new District("Kentucky", 1, false, 18));
		d.add(new District("Kentucky", 2, false, 16));
		d.add(new District("Kentucky", 3, true, -4));
		d.add(new District("Kentucky", 4, false, 16));
		d.add(new District("Kentucky", 5, false, 25));
		d.add(new District("Kentucky", 6, false, 9));
		d.add(new District("Louisiana", 1, false, 26));
		d.add(new District("Louisiana", 2, true, -23));
		d.add(new District("Louisiana", 3, false, 19));
		d.add(new District("Louisiana", 4, false, 13));
		d.add(new District("Louisiana", 5, false, 15));
		d.add(new District("Louisiana", 6, false, 21));
		d.add(new District("Maine", 1, true, -9));
		d.add(new District("Maine", 2, false, -2));
		d.add(new District("Maryland", 1, false, 14));
		d.add(new District("Maryland", 2, true, -10));
		d.add(new District("Maryland", 3, true, -9));
		d.add(new District("Maryland", 4, true, -26));
		d.add(new District("Maryland", 5, true, -14));
		d.add(new District("Maryland", 6, true, -4));
		d.add(new District("Maryland", 7, true, -24));
		d.add(new District("Maryland", 8, true, -11));
		d.add(new District("Massachusetts", 1, true, -13));
		d.add(new District("Massachusetts", 2, true, -8));
		d.add(new District("Massachusetts", 3, true, -6));
		d.add(new District("Massachusetts", 4, true, -6));
		d.add(new District("Massachusetts", 5, true, -14));
		d.add(new District("Massachusetts", 6, true, -4));
		d.add(new District("Massachusetts", 7, true, -31));
		d.add(new District("Massachusetts", 8, true, -6));
		d.add(new District("Massachusetts", 9, true, -5));
		d.add(new District("Michigan", 1, false, 5));
		d.add(new District("Michigan", 2, false, 7));
		d.add(new District("Michigan", 3, false, 4));
		d.add(new District("Michigan", 4, false, 5));
		d.add(new District("Michigan", 5, true, -10));
		d.add(new District("Michigan", 6, false, 1));
		d.add(new District("Michigan", 7, false, 3));
		d.add(new District("Michigan", 8, false, 2));
		d.add(new District("Michigan", 9, true, -6));
		d.add(new District("Michigan", 10, false, 6));
		d.add(new District("Michigan", 11, false, 4));
		d.add(new District("Michigan", 12, true, -15));
		d.add(new District("Michigan", 13, true, -34));
		d.add(new District("Michigan", 14, true, -29));
		d.add(new District("Minnesota", 1, true, 1));
		d.add(new District("Minnesota", 2, false, 2));
		d.add(new District("Minnesota", 3, false, 2));
		d.add(new District("Minnesota", 4, true, -11));
		d.add(new District("Minnesota", 5, true, -22));
		d.add(new District("Minnesota", 6, false, 10));
		d.add(new District("Minnesota", 7, true, 6));
		d.add(new District("Minnesota", 8, true, -1));
		d.add(new District("Mississippi", 1, false, 16));
		d.add(new District("Mississippi", 2, true, -13));
		d.add(new District("Mississippi", 3, false, 14));
		d.add(new District("Mississippi", 4, false, 21));
		d.add(new District("Missouri", 1, true, -28));
		d.add(new District("Missouri", 2, false, 8));
		d.add(new District("Missouri", 3, false, 13));
		d.add(new District("Missouri", 4, false, 13));
		d.add(new District("Missouri", 5, true, -9));
		d.add(new District("Missouri", 6, false, 12));
		d.add(new District("Missouri", 7, false, 19));
		d.add(new District("Missouri", 8, false, 17));
		d.add(new District("Montana", 1, false, 7));
		d.add(new District("Nebraska", 1, false, 10));
		d.add(new District("Nebraska", 2, true, 4));
		d.add(new District("Nebraska", 3, false, 23));
		d.add(new District("Nevada", 1, true, -14));
		d.add(new District("Nevada", 2, false, 5));
		d.add(new District("Nevada", 3, false, 0));
		d.add(new District("Nevada", 4, false, -4));
		d.add(new District("New Hampshire", 1, false, 1));
		d.add(new District("New Hampshire", 2, true, -3));
		d.add(new District("New Jersey", 1, true, -13));
		d.add(new District("New Jersey", 2, false, -1));
		d.add(new District("New Jersey", 3, false, 1));
		d.add(new District("New Jersey", 4, false, 7));
		d.add(new District("New Jersey", 5, false, 4));
		d.add(new District("New Jersey", 6, true, -8));
		d.add(new District("New Jersey", 7, false, 6));
		d.add(new District("New Jersey", 8, true, -24));
		d.add(new District("New Jersey", 9, true, -14));
		d.add(new District("New Jersey", 10, true, -34));
		d.add(new District("New Jersey", 11, false, 6));
		d.add(new District("New Jersey", 12, true, -14));
		d.add(new District("New Mexico", 1, true, -7));
		d.add(new District("New Mexico", 2, false, 5));
		d.add(new District("New Mexico", 3, true, -8));
		d.add(new District("New York", 1, false, 2));
		d.add(new District("New York", 2, false, 1));
		d.add(new District("New York", 3, true, 0));
		d.add(new District("New York", 4, true, -3));
		d.add(new District("New York", 5, true, -35));
		d.add(new District("New York", 6, true, -13));
		d.add(new District("New York", 7, true, -34));
		d.add(new District("New York", 8, true, -35));
		d.add(new District("New York", 9, true, -32));
		d.add(new District("New York", 10, true, -23));
		d.add(new District("New York", 11, false, 2));
		d.add(new District("New York", 12, true, -27));
		d.add(new District("New York", 13, true, -42));
		d.add(new District("New York", 14, true, -26));
		d.add(new District("New York", 15, true, -43));
		d.add(new District("New York", 16, true, -21));
		d.add(new District("New York", 17, true, -5));
		d.add(new District("New York", 18, true, 0));
		d.add(new District("New York", 19, false, -1));
		d.add(new District("New York", 20, true, -7));
		d.add(new District("New York", 21, false, 0));
		d.add(new District("New York", 22, false, 3));
		d.add(new District("New York", 23, false, 3));
		d.add(new District("New York", 24, false, -5));
		d.add(new District("New York", 25, true, -7));
		d.add(new District("New York", 26, true, -12));
		d.add(new District("New York", 27, false, 8));
		d.add(new District("North Carolina", 1, true, -19));
		d.add(new District("North Carolina", 2, false, 10));
		d.add(new District("North Carolina", 3, false, 11));
		d.add(new District("North Carolina", 4, true, -20));
		d.add(new District("North Carolina", 5, false, 11));
		d.add(new District("North Carolina", 6, false, 10));
		d.add(new District("North Carolina", 7, false, 12));
		d.add(new District("North Carolina", 8, false, 11));
		d.add(new District("North Carolina", 9, false, 18));
		d.add(new District("North Carolina", 10, false, 11));
		d.add(new District("North Carolina", 11, false, 13));
		d.add(new District("North Carolina", 12, true, -26));
		d.add(new District("North Carolina", 13, false, 8));
		d.add(new District("North Dakota", 1, false, 10));
		d.add(new District("Ohio", 1, false, 6));
		d.add(new District("Ohio", 2, false, 8));
		d.add(new District("Ohio", 3, true, -17));
		d.add(new District("Ohio", 4, false, 9));
		d.add(new District("Ohio", 5, false, 7));
		d.add(new District("Ohio", 6, false, 8));
		d.add(new District("Ohio", 7, false, 6));
		d.add(new District("Ohio", 8, false, 15));
		d.add(new District("Ohio", 9, true, -15));
		d.add(new District("Ohio", 10, false, 3));
		d.add(new District("Ohio", 11, true, -30));
		d.add(new District("Ohio", 12, false, 8));
		d.add(new District("Ohio", 13, true, -11));
		d.add(new District("Ohio", 14, false, 4));
		d.add(new District("Ohio", 15, false, 6));
		d.add(new District("Ohio", 16, false, 6));
		d.add(new District("Oklahoma", 1, false, 18));
		d.add(new District("Oklahoma", 2, false, 20));
		d.add(new District("Oklahoma", 3, false, 26));
		d.add(new District("Oklahoma", 4, false, 19));
		d.add(new District("Oklahoma", 5, false, 12));
		d.add(new District("Oregon", 1, true, -7));
		d.add(new District("Oregon", 2, false, 10));
		d.add(new District("Oregon", 3, true, -22));
		d.add(new District("Oregon", 4, true, -2));
		d.add(new District("Oregon", 5, true, 0));
		d.add(new District("Pennsylvania", 1, true, -28));
		d.add(new District("Pennsylvania", 2, true, -38));
		d.add(new District("Pennsylvania", 3, false, 8));
		d.add(new District("Pennsylvania", 4, false, 9));
		d.add(new District("Pennsylvania", 5, false, 8));
		d.add(new District("Pennsylvania", 6, false, 2));
		d.add(new District("Pennsylvania", 7, false, 2));
		d.add(new District("Pennsylvania", 8, false, 1));
		d.add(new District("Pennsylvania", 9, false, 14));
		d.add(new District("Pennsylvania", 10, false, 12));
		d.add(new District("Pennsylvania", 11, false, 6));
		d.add(new District("Pennsylvania", 12, false, 9));
		d.add(new District("Pennsylvania", 13, true, -13));
		d.add(new District("Pennsylvania", 14, true, -15));
		d.add(new District("Pennsylvania", 15, false, 2));
		d.add(new District("Pennsylvania", 16, false, 4));
		d.add(new District("Pennsylvania", 17, true, -4));
		d.add(new District("Pennsylvania", 18, false, 10));
		d.add(new District("Rhode Island", 1, true, -15));
		d.add(new District("Rhode Island", 2, true, -8));
		d.add(new District("South Carolina", 1, false, 11));
		d.add(new District("South Carolina", 2, false, 16));
		d.add(new District("South Carolina", 3, false, 18));
		d.add(new District("South Carolina", 4, false, 15));
		d.add(new District("South Carolina", 5, false, 9));
		d.add(new District("South Carolina", 6, true, -21));
		d.add(new District("South Carolina", 7, false, 7));
		d.add(new District("South Dakota", 1, false, 10));
		d.add(new District("Tennessee", 1, false, 25));
		d.add(new District("Tennessee", 2, false, 20));
		d.add(new District("Tennessee", 3, false, 16));
		d.add(new District("Tennessee", 4, false, 18));
		d.add(new District("Tennessee", 5, true, -5));
		d.add(new District("Tennessee", 6, false, 21));
		d.add(new District("Tennessee", 7, false, 18));
		d.add(new District("Tennessee", 8, false, 19));
		d.add(new District("Tennessee", 9, true, -25));
		d.add(new District("Texas", 1, false, 24));
		d.add(new District("Texas", 2, false, 16));
		d.add(new District("Texas", 3, false, 17));
		d.add(new District("Texas", 4, false, 25));
		d.add(new District("Texas", 5, false, 17));
		d.add(new District("Texas", 6, false, 11));
		d.add(new District("Texas", 7, false, 13));
		d.add(new District("Texas", 8, false, 29));
		d.add(new District("Texas", 9, true, -25));
		d.add(new District("Texas", 10, false, 11));
		d.add(new District("Texas", 11, false, 31));
		d.add(new District("Texas", 12, false, 19));
		d.add(new District("Texas", 13, false, 32));
		d.add(new District("Texas", 14, false, 12));
		d.add(new District("Texas", 15, true, -5));
		d.add(new District("Texas", 16, true, -12));
		d.add(new District("Texas", 17, false, 13));
		d.add(new District("Texas", 18, true, -24));
		d.add(new District("Texas", 19, false, 26));
		d.add(new District("Texas", 20, true, -6));
		d.add(new District("Texas", 21, false, 12));
		d.add(new District("Texas", 22, false, 15));
		d.add(new District("Texas", 23, false, 3));
		d.add(new District("Texas", 24, false, 13));
		d.add(new District("Texas", 25, false, 12));
		d.add(new District("Texas", 26, false, 20));
		d.add(new District("Texas", 27, false, 13));
		d.add(new District("Texas", 28, true, -7));
		d.add(new District("Texas", 29, true, -12));
		d.add(new District("Texas", 30, true, -27));
		d.add(new District("Texas", 31, false, 12));
		d.add(new District("Texas", 32, false, 10));
		d.add(new District("Texas", 33, true, -18));
		d.add(new District("Texas", 34, true, -8));
		d.add(new District("Texas", 35, true, -11));
		d.add(new District("Texas", 36, false, 25));
		d.add(new District("Utah", 1, false, 27));
		d.add(new District("Utah", 2, false, 18));
		d.add(new District("Utah", 3, false, 28));
		d.add(new District("Utah", 4, false, 16));
		d.add(new District("Vermont", 1, true, -16));
		d.add(new District("Virginia", 1, false, 6));
		d.add(new District("Virginia", 2, false, 2));
		d.add(new District("Virginia", 3, true, -27));
		d.add(new District("Virginia", 4, false, 4));
		d.add(new District("Virginia", 5, false, 5));
		d.add(new District("Virginia", 6, false, 12));
		d.add(new District("Virginia", 7, false, 10));
		d.add(new District("Virginia", 8, true, -16));
		d.add(new District("Virginia", 9, false, 15));
		d.add(new District("Virginia", 10, false, 2));
		d.add(new District("Virginia", 11, true, -10));
		d.add(new District("Washington", 1, true, -4));
		d.add(new District("Washington", 2, true, -8));
		d.add(new District("Washington", 3, false, 2));
		d.add(new District("Washington", 4, false, 13));
		d.add(new District("Washington", 5, false, 7));
		d.add(new District("Washington", 6, true, -5));
		d.add(new District("Washington", 7, true, -29));
		d.add(new District("Washington", 8, false, 1));
		d.add(new District("Washington", 9, true, -17));
		d.add(new District("Washington", 10, true, -5));
		d.add(new District("West Virginia", 1, false, 14));
		d.add(new District("West Virginia", 2, false, 11));
		d.add(new District("West Virginia", 3, false, 14));
		d.add(new District("Wisconsin", 1, false, 3));
		d.add(new District("Wisconsin", 2, true, -17));
		d.add(new District("Wisconsin", 3, true, -5));
		d.add(new District("Wisconsin", 4, true, -23));
		d.add(new District("Wisconsin", 5, false, 13));
		d.add(new District("Wisconsin", 6, false, 5));
		d.add(new District("Wisconsin", 7, false, 2));
		d.add(new District("Wisconsin", 8, false, 2));
		d.add(new District("Wyoming", 1, false, 22));
	}
	
	
	
	
	public void holdElection(int year) {
		numSwitched = 0;
		this.year = year;
		double k1 = CalculationFactory.getK1Val(year);
		k = k1;
		double k2 = CalculationFactory.getK2Val(year);
		for (District t: d) {
			boolean isDemocrat = t.isDemocrat;
			t.holdElection(k1, k2);
			t.adjustPVI(CalculationFactory.getPVIAdjustment(t.pvi, t.gerrymanderedRating));
			if(isDemocrat != t.isDemocrat) {
				numSwitched++;
			}
		}
	}
	
	public void getGerrymanderedRatings() {
		String csvFile = "/Users/Janine/Documents/CongressionalDistricts.csv";
	      BufferedReader br = null;
	      String line = "";
	      String cvsSplitBy = ",";
	      ArrayList<Point> l = new ArrayList<Point>();
	      try {

	          br = new BufferedReader(new FileReader(csvFile));
	          
	          
	          while ((line = br.readLine()) != null) {
	        	  //System.out.println(br.readLine());
	             
	              // use comma as separator
	            String[] coord = line.split(cvsSplitBy);
	            if (!coord[1].equals("State")) {
	            	String state = coord[1];
	            	int district = Integer.parseInt(coord[2]);
	            	double gerryScore = Double.parseDouble(coord[3]);
	            	for (District d: this.d) {
	    				if (d.state.equals(state) && d.number == district) {
	    					d.setGerrymanderedRating(gerryScore);
	    					break;
	    				}
	    			}
	            }
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
	
	public int getYear() {
		return year;
	}
	
	public void setSwing(int swingStates) {
		this.swingStates = swingStates;
	}
	
	public int getSwing() {
		return swingStates;
	}
	
	public double getK() {
		return k;
	}
	
	public int getNumSwitched() {
		return numSwitched;
	}
	
	public ArrayList<District> getDistricts() {
		return d;
	}
	
	public static DistrictManager getInstance() {
		return dm;
	}
	
}
