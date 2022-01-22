///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the DndClassFactory class.
///////////////////////////////////////////////////////////////////////////////

package classes_test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import classes.Barbarian;
import classes.DndClassFactory;

public class DndClassFactoryTest {
	
	private DndClassFactory classFactory = new DndClassFactory();
	
	@Test
	public void newClassTest() {
		assertTrue(classFactory.newClass("Barbarian") instanceof Barbarian);
	}
	
	@Test
	public void newClassExceptionTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			classFactory.newClass("Test");
		});
		assertTrue(exception.getMessage().contains("Unknown Class"));
	}

}
