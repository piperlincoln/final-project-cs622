///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the serialization helper class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import charactergeneration.SerializationHelper;
import classes.DndClass;
import races.DndRace;

public class SerializationHelperTest {
	
	SerializationHelper serializationHelper = new SerializationHelper();
	
	@Test
	public void readRaceObjectDataTest() {
		try {
			DndRace testRace = (DndRace) serializationHelper.readRaceObjectData("raceFile.dat");
			assertTrue(testRace.getDescription().length() > 0);
		} catch (IOException | ClassNotFoundException e) {}
	}
	
	@Test
	public void readClassObjectDataTest() {
		try {
			DndClass testClass = (DndClass) serializationHelper.readClassObjectData("classFile.dat");
			assertTrue(testClass.getDescription().length() > 0);
		} catch (IOException | ClassNotFoundException e) {}
	}
	
	@Test
	public void readObjectDataExceptionTest() {
		assertThrows(FileNotFoundException.class, () -> {
			serializationHelper.readRaceObjectData("file.dat");
		});
	}
	
	@Test
	public void writeObjectDataTest() {
		try {
			serializationHelper.writeObjectData("test.dat", "Testing");
		} catch (IOException e) {}
		File file = new File("test.dat");
		assertTrue(file.exists());
		file.delete();
	}
}
