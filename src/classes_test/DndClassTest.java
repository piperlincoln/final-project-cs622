///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the subclasses of the DndClass class.
///////////////////////////////////////////////////////////////////////////////

package classes_test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import classes.Barbarian;
import classes.DndClass;

public class DndClassTest {
	
	private DndClass testClass = new Barbarian();
	
	@Test 
	public void getClassTest() {
		assertEquals(testClass.getDndClass(), "Barbarian");
	}
	
	@Test
	public void getDescriptionTest() {
		assertEquals(testClass.getDescription(), "A fierce warrior of primitive background who can enter a battle rage.");
	}
	
	@Test
	public void getProficienciesTest() {
		testClass.setProficiencies(new String[] {"Animal Handling", "Athletics"});
		String[] proficiencies = testClass.getProficiencies();
		assertEquals(proficiencies.length, 2);
		assertEquals(proficiencies[0], "Animal Handling");
		assertEquals(proficiencies[1], "Athletics");
	}

}
