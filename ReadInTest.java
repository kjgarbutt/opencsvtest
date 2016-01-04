package sim.app.geo.opencsvtest;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** 
 * This is a test to see if I can get MASON to read in a .CSV file and iterate through the lines
 * and display data in, say, the fourth column. Fingers crossed.
 * BOOM! Got it to work.
 * Alternatively, use OpenCSV: http://opencsv.sourceforge.net/
 * The output will look a little something like this:
 * 
 * 		LSOA11CD = LSOA11CD, LSOA11NM = LSOA11NM, OID_ = OID_, GOR_CODE = GOR_CODE, GOR_NAME = GOR_NAME, ...
 * 		LSOA11CD = E01026419, LSOA11NM = Breckland 010A, OID_ = 42, GOR_CODE = E12000006, GOR_NAME = East of England, ...
 * 
 * 		Finished reading .CSV file: /Users/KJGarbutt/Copy/workspace/...
 * 
 */


    public class ReadInTest {

      public static void main(String[] args) {

    	ReadInTest obj = new ReadInTest();
    	obj.run();

      }

      public void run() {

    	String csvFile = "/Users/KJGarbutt/Copy/workspace/abmtest/src/sim/app/geo/gridlock_norfolk_copy/data/areas_roads_merge1.csv";
    	BufferedReader br = null;
    	
    	String line = "";
    	String cvsSplitBy = ",";

    	try {

    		br = new BufferedReader(new FileReader(csvFile));
    		
    		//String headerLine = br.readLine();
    		//System.out.println(headerLine);
    		//System.out.println();
    		
    		while ((line = br.readLine()) != null) {

    		    // use comma as separator
    			String[] lsoa = line.split(cvsSplitBy);

    			System.out.println("LSOA11CD = " + lsoa[0]
								+ ", LSOA11NM = " + lsoa[1]
								+ ", OID_ = " + lsoa[2]
								+ ", GOR_CODE = " + lsoa[3]
								+ ", GOR_NAME = " + lsoa[4]
								+ ", LA_CODE = " + lsoa[5]
								+ ", LA_NAME = " + lsoa[6]
								+ ", MSOA_CODE = " + lsoa[7]
								+ ", MSOA_NAME = " + lsoa[8]
								+ ", LSOA_CODE = " + lsoa[9]
								+ ", LSOA_NAME = " + lsoa[10]
								+ ", LSOAAREA = " + lsoa[11]
								+ ", TRACTTOTRA = " + lsoa[12]
								+ ", LSOA_ID = " + lsoa[13]
								+ ", CODE = " + lsoa[14]
								+ ", OSODR = " + lsoa[15]
								+ ", NUMBER = " + lsoa[16]
								+ ", ROAD_NAME = " + lsoa[17]
								+ ", METRES = " + lsoa[18]
								+ ", INDICATOR = " + lsoa[19]
								+ ", ID_ID = " + lsoa[20]
								+ ", ROAD_ID = " + lsoa[21]
								+ ", SCTRACTW = " + lsoa[22]
								+ ", SCTRACTR = " + lsoa[23]);}

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

    	System.out.println();
    	System.out.println("Finished reading .CSV file: " + csvFile);
      }
    }
