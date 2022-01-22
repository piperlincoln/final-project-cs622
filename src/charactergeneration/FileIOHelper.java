///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The main control logic of the D&Dvelop program.
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
 * A class to assist in reading input files and writing output files. 
 */
public class FileIOHelper {
	
	public static ArrayList<String> readFileData(String fileLocation) throws FileNotFoundException {
		// Initialize a scanner to read race or class data from an input file.
		Scanner infile = new Scanner(new File(fileLocation)).useDelimiter("\\n");;
		
		// Add the race or class name and description into a list.
		ArrayList<String> dataList = new ArrayList<String>();
		while (infile.hasNext()) {         
			dataList.add(infile.next());
		}
		infile.close();
		return dataList;
	}
	
	public static void writeFileData(String fileLocation, String characterData) throws IOException {
		// Initialize a file writer to write the character information to an output file.
		FileWriter fr = new FileWriter(fileLocation);
		BufferedWriter br = new BufferedWriter(fr);
		
		// Write the information about the D&D character to the specified file location.
		br.write(characterData);
		br.close();
	}
}
