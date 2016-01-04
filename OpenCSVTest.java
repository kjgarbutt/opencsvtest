package sim.app.geo.opencsvtest;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;


/** 
 * This is a test OpenCSV: http://opencsv.sourceforge.net/
 * /Users/KJGarbutt/Desktop/areas_roads_merge1.csv
 */



public class OpenCSVTest {
	  public static void main(String[] args) throws UnsupportedEncodingException, IOException {
	    CSVWriter writer2 = new CSVWriter(new FileWriter("/Users/KJGarbutt/Desktop/testing.csv"), '\t');

	    String[] strings = new String[10];
	    for (int i = 0; i < 10; i++) {
	      strings[i] = "Testing";
	    }

	    String[] wrap = new String[1]; //probably saving on GC

	    for (String s: strings) {
	      wrap[0]=s;
	      writer2.writeNext(wrap);
	    }
	    writer2.close();

	  }

	}

/**
 * The following READS the whole CSV file in ONE go and then iterates over rows one by one.
 * 
 * Taken from: http://howtodoinjava.com/2014/08/12/parse-read-write-csv-files-opencsv-tutorial/
 */

/*
public class OpenCSVTest
{
   @SuppressWarnings("resource")
   public static void main(String[] args) throws Exception
   {
	   //Build reader instance
	   //Read data.csv
	   //Default seperator is comma
	   //Default quote character is double quote
	   //Start reading from line number 2 (line numbers start from zero)
	   CSVReader reader = new CSVReader(new FileReader("/Users/KJGarbutt/Desktop/Untitled1.csv"), ',', '"', 1);
	   
	   //Read all rows at once
	   List<String[]> allRows = reader.readAll();
	   
	  //Read CSV line by line and use the string array as you want
	 for(String[] row : allRows){
        System.out.println(Arrays.toString(row));
     }
   }
}
*/


/**
 * The following READS the CSV file LINE BY LINE and prints to console.
 * You can read the whole CSV file once and then iterate over data as you want.
 * 
 * Taken from: http://howtodoinjava.com/2014/08/12/parse-read-write-csv-files-opencsv-tutorial/
 */

/*
	public class OpenCSVTest
    	{
    	   @SuppressWarnings("resource")
    	   public static void main(String[] args) throws Exception
    	   {
    	      //Build reader instance
    	      //Read data.csv
    	      //Default seperator is comma
    	      //Default quote character is double quote
    	      //Start reading from line number 2 (line numbers start from zero)
    	      CSVReader reader = new CSVReader(new FileReader("/Users/KJGarbutt/Copy/workspace/abmtest/src/sim/app/geo/gridlock_norfolk_copy/data/areas_roads_merge1.csv"), ',' , '"' , 1);
    	       
    	      //Read CSV line by line and use the string array as you want
    	      String[] nextLine;
    	      while ((nextLine = reader.readNext()) != null) {
    	         if (nextLine != null) {
    	            //Verifying the read data here
    	            System.out.println(Arrays.toString(nextLine));
    	         }
    	       }
    	   }
    	}
*/


/**
 * The following WRITES to a file
 * We create an instance of CSVWriter with appropriate configuration options and start writing data to CSV file
 * 
 * Taken from: http://howtodoinjava.com/2014/08/12/parse-read-write-csv-files-opencsv-tutorial/
 */

/*
public class OpenCSVTest
{
   public static void main(String[] args) throws Exception
   {
      String csv = "/Users/KJGarbutt/Desktop/Untitled1.csv";
      CSVWriter writer = new CSVWriter(new FileWriter(csv));
        
      //Create record
      String [] record = "4,David,Miller,Australia,30".split(",");
      //Write the record to file
      writer.writeNext(record);
        
      //close the writer
      writer.close();
   }
}
*/


/**
 * Simple example to WRITE one line in CSV file.
 * We created object of class CSVWriter and called its writeNext() method.
 * The writeNext() methods takes String [] as argument.
 * The program writes OVER the .csv you list or CREATES a new file with Apple, Orange and PineApple in the 
 * first three cells.
 * 
 * Taken from: http://www.simplecodestuffs.com/read-write-csv-file-in-java-using-opencsv-library/
 */
/*
public class OpenCSVTest {

	public static void main(String[] args) throws IOException {
		String csv = "/Users/KJGarbutt/Desktop/Untitled1.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv));
		
		String [] fruits= "Apple,Orange,PineApple".split(",");
		
		writer.writeNext(fruits);
		writer.close();
		}
	}
*/


/**
 * Below we WRITE a List of String[] to CSV entirely.
 * We used writeAll() method of class CSVWriter to write a List of String[] as CSV file.
 * The program writes OVER the .csv you list or CREATES a new file with the following:
 * 
 * DB2			Enterprise Database
 * PostgreSQL	Open Source Enterprise Database
 * MySQL		Open Source Database
 * 
 * Taken from: http://www.simplecodestuffs.com/read-write-csv-file-in-java-using-opencsv-library/
 */

/*
public class OpenCSVTest {

	public static void main(String[] args) throws IOException {
		String csv = "/Users/KJGarbutt/Desktop/Untitled1.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv));
 
		List<String[]> database = new ArrayList<String[]>();
		database.add(new String[] {"DB2", "Enterprise Database"});
		database.add(new String[] {"PostgreSQL", "Open Source Enterprise Database"});
		database.add(new String[] {"MySQL", "Open Source Database"});
		
		writer.writeAll(database); 
		writer.close();
		}
	}
*/


/**
 * Below we APPEND ONE line of data to an EXISTING .csv file instead of writing a new file.
 * You can achieve this functionality by passing a second argument to FileWriter instance.
 * There is no direct support for appending in OpenCSV library.
 * 
 * Taken from: http://howtodoinjava.com/2014/08/12/parse-read-write-csv-files-opencsv-tutorial/
 */

/*
public class OpenCSVTest
{
   public static void main(String[] args) throws Exception
   {
      String csv = "/Users/KJGarbutt/Desktop/Untitled1.csv";
      CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        
      String [] record = "TEST,David,Feezor,USA,40".split(",");
        
      writer.writeNext(record);
        
      writer.close();
   }
}
*/


/**
 * Below we APPEND an ARRAY of data to an EXISTING .csv file instead of writing a new file.
 * You can achieve this functionality by passing a second argument to FileWriter instance.
 * We used writeAll() method of class CSVWriter to write a List of String[] as CSV file.
 * 
 * Adapted from: http://www.simplecodestuffs.com/read-write-csv-file-in-java-using-opencsv-library/
 */

/*
public class OpenCSVTest
{
   public static void main(String[] args) throws Exception
   {
      String csv = "/Users/KJGarbutt/Desktop/Untitled1.csv";
      CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        
      List<String[]> database = new ArrayList<String[]>();
		database.add(new String[] {"ASSx2", "ASS Database"});
		database.add(new String[] {"PostgreASS x2", "Open Source ASS Database"});
		database.add(new String[] {"MyASS x2", "Open Source ASS"});
		
		writer.writeAll(database); 
        
      writer.close();
   }
}
*/


/**
 * The following WRITES "Testing" in the first column 10x in a new .csv called testing.csv
 * 
 * Taken from: http://stackoverflow.com/questions/18785559/using-opencsv-to-write-in-a-column-instead-of-row
 */
/*
public class OpenCSVTest {
	  public static void main(String[] args) throws UnsupportedEncodingException, IOException {
	    CSVWriter writer2 = new CSVWriter(new FileWriter("/Users/KJGarbutt/Desktop/testing.csv"), '\t');

	    String[] strings = new String[10];
	    for (int i = 0; i < 10; i++) {
	      strings[i] = "Testing";
	    }

	    String[] wrap = new String[1]; //probably saving on GC

	    for (String s: strings) {
	      wrap[0]=s;
	      writer2.writeNext(wrap);
	    }
	    writer2.close();

	  }

	}
*/


/**
 * Here we READ a .csv file LINE BY LINE using the readNext() method of CSVReader class.
 * It returns a String array for each value in row and looks like this:
 * 
 * Starting to parse CSV file using opencsv
 * Cell column index: 0
 * Cell Value: LSOA11CD
 * -------------
 * Cell column index: 1
 * Cell Value: LSOA11NM
 * -------------
 * ...
 * ...
 * Taken from: http://www.simplecodestuffs.com/read-write-csv-file-in-java-using-opencsv-library/
 */

/*
public class OpenCSVTest
{
public static void main(String[] args) 
{
        String filename = "/Users/KJGarbutt/Desktop/areas_roads_merge1.csv";
        OpenCSVTest parseCSVFile = new OpenCSVTest();
        
        System.out.println("Starting to parse CSV file using opencsv");
        parseCSVFile.parseUsingOpenCSV(filename);
}

private void parseUsingOpenCSV(String filename) 
{
        CSVReader reader;
        try 
        {
        reader = new CSVReader(new FileReader(filename));
        String[] row;

        while ((row = reader.readNext()) != null) 
        {
                for (int i = 0; i < row.length; i++) 
                {
                        // display CSV values
                        System.out.println("Cell column index: " + i);
                        System.out.println("Cell Value: " + row[i]);
                        System.out.println("-------------");
                }
        }
        } 
        catch (FileNotFoundException e) 
        {
                System.err.println(e.getMessage());
        }
        catch (IOException e) 
        {
                System.err.println(e.getMessage());
        }
}
}

*/


/**
 * It is also possible to READ full .csv file entirely by using readAll() method.
 * The readAll() method returns a List of String[] for given CSV file.
 * Again, it returns a String array for each value in row and looks like this:
 * 
 * Starting to parse CSV file using opencsv
 * Cell column index: 0
 * Cell Value: LSOA11CD
 * -------------
 * Cell column index: 1
 * Cell Value: LSOA11NM
 * -------------
 * ...
 * ...
 * Taken from: http://www.simplecodestuffs.com/read-write-csv-file-in-java-using-opencsv-library/
 */

/*
public class OpenCSVTest 
{

public static void main(String[] args) 
{
        String filename = "/Users/KJGarbutt/Desktop/areas_roads_merge1.csv";
        OpenCSVTest parseCSVFile = new OpenCSVTest();

        System.out.println("Starting to parse CSV file using opencsv");
        parseCSVFile.parseUsingOpenCSV(filename);
}

private void parseUsingOpenCSV(String filename) 
 {
 CSVReader reader;
  try 
  {
        reader = new CSVReader(new FileReader(filename));
        String[] row;
        List<?> content = reader.readAll();

        for (Object object : content) 
        {
                row = (String[]) object;
                for (int i = 0; i < row.length; i++) 
                {
                        // display CSV values
                System.out.println("Cell column index: " + i);
                System.out.println("Cell Value: " + row[i]);
                System.out.println("-------------");
                }
        }
  }
  catch (FileNotFoundException e) 
  {
    System.err.println(e.getMessage());
  }
  catch (IOException e) 
  {
   System.err.println(e.getMessage());
  }
  }
}
*/
