///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the DndRaceFactory class.
///////////////////////////////////////////////////////////////////////////////

package races_test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import charactergeneration.UserInputException;
import races.DndRaceFactory;
import races.Dwarf;

public class DndRaceFactoryTest {
	
	private DndRaceFactory raceFactory = new DndRaceFactory();
	
	@Test
	public void newRaceTest() throws UserInputException {
		assertTrue(raceFactory.newRace("Dwarf") instanceof Dwarf);
	}
	
	@Test
	public void newRaceExceptionTest() {
		Exception exception = assertThrows(UserInputException.class, () -> {
			raceFactory.newRace("Test");
		});
		assertTrue(exception.toString().contains("Unknown Race"));
	}

}
