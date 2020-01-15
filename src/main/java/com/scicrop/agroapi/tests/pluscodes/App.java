package com.scicrop.agroapi.tests.pluscodes;

import com.google.openlocationcode.OpenLocationCode;

/**
 * OLC PluscCodes simple test class
 *
 */
public class App {
	
	public static void main( String[] args ){

		String testUsage = "Test usage example: java -jar test.pluscodes.jar -2.23447 -53.21127";
		
		try {

			if(args.length != 2) {
				System.err.println(testUsage);
				System.exit(1);
			}
			
			Double lat = Double.parseDouble(args[0]);
			Double lng = Double.parseDouble(args[1]);

			System.out.println("Tests results");
			System.out.println("=============");
			System.out.println("Latitude: "+lat);
			System.out.println("Longitude: "+lng);
			String olcStr = OpenLocationCode.encode(lat, lng, 10);
			System.out.println("Full: "+olcStr);
			String olcWithin = OpenLocationCode.encode(lat, lng, 4);
			olcWithin = olcWithin.split("0")[0];
			olcWithin = olcStr.split(olcWithin)[1];
			System.out.println("Within: "+olcWithin);
			OpenLocationCode olc = new OpenLocationCode(olcStr);
			OpenLocationCode shortened = olc.shorten(lat, lng);
			System.out.println("Shortened: "+shortened);

		}catch (Exception e) {
			System.err.println("Execution error.");
			System.err.println("Exception: "+e.getMessage());
			System.err.println(testUsage);
			System.exit(1);
		}
	}

}
