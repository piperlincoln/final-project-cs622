///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the DndCharacter class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import charactergeneration.DndCharacter;
import classes.DndClass;
import classes.Wizard;
import races.DndRace;
import races.Tiefling;

public class DndCharacterTest {
	
	private DndCharacter testCharacter = new DndCharacter("Gundren Rockseeker");
	
	@Test
	public void getRaceTest() {
		DndRace newRace = new Tiefling();
		testCharacter.setRace(newRace);
		assertEquals(testCharacter.getRace(), "Tiefling");
	}
	
	@Test
	public void getClassTest() {
		DndClass newClass = new Wizard();
		testCharacter.setDndClass(newClass);
		assertEquals(testCharacter.getDndClass(), "Wizard");
	}
	
	@Test
	public void getBackgroundTest() {
		testCharacter.setBackground("Sage: You spent years learning the lore of the multiverse.");
		assertEquals(testCharacter.getBackground(), "Sage");
	}
	
	@Test
	public void calculateStatisticsTest() {
		testCharacter.setDndClass(new Wizard());
		testCharacter.calculateStatistics();
		// Find the maximum statistic and make sure it's assigned to the right location.
		int maxScoreIndex = 0;
		for (int i = 0; i < 6; i++) {
			if (testCharacter.getStatistics()[i] > testCharacter.getStatistics()[maxScoreIndex]) {
				maxScoreIndex = i;
			}
		}
		// For the Wizard class, the maximum statistic should be Intelligence.
		assertEquals(maxScoreIndex, 3);
	}
}
