///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the file I/O helper class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import charactergeneration.FileIOHelper;

public class FileIOHelperTest {
	
	@Test
	public void readFileDataTest() {
		try {
			ArrayList<String> backgroundData = FileIOHelper.readFileData("src/charactergeneration/DndBackgrounds.txt");
			assertEquals(backgroundData.size(), 7);
		} catch (FileNotFoundException e) {}
	}
	
	@Test
	public void readFileDataExceptionTest() {
		assertThrows(FileNotFoundException.class, () -> {
			FileIOHelper.readFileData("file");
		});
	}
	
	@Test
	public void writeFileDataTest() {
		String fileName = "file-io-test.txt";
		try {
			FileIOHelper.writeFileData("file-io-test.txt", "Test Data");
			File file = new File(fileName);
			assertTrue(file.exists());
			file.delete();
		} catch (IOException e) {}
	}
}
