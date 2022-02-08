///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A class to assist with reading input and writing output.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to assist with reading input files and writing output files. 
 */
public class FileIOHelper {
	
	/**
	 * Read an input file at the specified location and return each line in an ArrayList. 
	 */
	public static ArrayList<String> readFileData(String fileLocation) throws FileNotFoundException {
		// Initialize a scanner to read race or class data from an input file.
		try (Scanner infile = new Scanner(new File(fileLocation)).useDelimiter("\\n")) {
			// Add the race or class name and description into a list.
			ArrayList<String> dataList = new ArrayList<String>();
			while (infile.hasNext()) {         
				dataList.add(infile.next());
			}
			
			// Return the list of races or classes in the file.
			return dataList;
		}
	}
	
	/**
	 * Write the character data to the output file at the specified location. 
	 */
	public static void writeFileData(String fileLocation, String characterData) throws IOException {
		try (FileWriter fr = new FileWriter(fileLocation)) {
			// Initialize a file writer to write the character information to an output file.
			BufferedWriter br = new BufferedWriter(fr);
			
			// Write the information about the D&D character to the specified file location.
			br.write(characterData);
			br.close();
		}
	}
}
