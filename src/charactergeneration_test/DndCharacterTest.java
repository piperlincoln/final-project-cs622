///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the DndCharacter class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	public void rollDiceTest() {
		int diceRoll = testCharacter.rollDice();
		assertTrue(diceRoll > 0);
		assertTrue(diceRoll < 21);
	}
}
