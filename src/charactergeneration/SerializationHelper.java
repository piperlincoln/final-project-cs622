///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A class to assist with object serialization.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import classes.DndClass;
import races.DndRace;

/**
 * A class to assist with reading and writing objects for short term storage.
 */
public class SerializationHelper {
	
	static interface ObjectSerialization {
		public Object readObjectData(String objectLocation) throws FileNotFoundException, IOException, ClassNotFoundException;
	}
	
	private ObjectSerialization dndRaceGeneration;   // The lambda function for reading DndRace information.
	private ObjectSerialization dndClassGeneration;  // The lambda function for reading DndClass information.
	
	public SerializationHelper() {
		dndRaceGeneration = (x) -> {
	        try (ObjectInputStream infile = new ObjectInputStream(new FileInputStream(x))) {      
	            return (DndRace) (infile.readObject());
	        }
		};
		
		dndClassGeneration = (x) -> {
	        try (ObjectInputStream infile = new ObjectInputStream(new FileInputStream(x))) {      
	            return (DndClass) (infile.readObject());
	        }
		};
	}
	
	/**
	 * Assist with reading a DndRace object.
	 */
	public Object readRaceObjectData(String objectLocation) throws FileNotFoundException, IOException, ClassNotFoundException {
        return this.dndRaceGeneration.readObjectData(objectLocation);
	}
	
	/**
	 * Assist with reading a DndClass object.
	 */
	public Object readClassObjectData(String objectLocation) throws FileNotFoundException, IOException, ClassNotFoundException {
        return this.dndClassGeneration.readObjectData(objectLocation);
	}
	
	/**
	 * Assist with writing an object.
	 */
	public void writeObjectData(String objectLocation, Object characterObject) throws FileNotFoundException, IOException {
		try (ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream(objectLocation))) {       
			outfile.writeObject(characterObject);             
        }
	}
}
