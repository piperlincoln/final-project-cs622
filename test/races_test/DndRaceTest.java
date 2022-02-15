///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the subclasses of the DndRace class.
///////////////////////////////////////////////////////////////////////////////

package races_test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import races.DndRace;
import races.Dwarf;

public class DndRaceTest {
	
	private DndRace testRace = new Dwarf();
	
	@Test 
	public void getRaceTest() {
		assertEquals(testRace.getRace(), "Dwarf");
	}
	
	@Test
	public void getDescriptionTest() {
		assertEquals(testRace.getDescription(), "Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal.");
	}
	
	@Test
	public void getLanguagesTest() {
		String[] languages = testRace.getLanguages();
		assertEquals(languages[0], "Common");
		assertEquals(languages[1], "Dwarven");
	}
	
	@Test
	public void getTraitsTest() {
		assertEquals(testRace.getTraits().length, 6);
	}
	
	@Test
	public void getRecommendationTest() {
		String[] classRecommendations = testRace.getRecommendation();
		assertEquals(classRecommendations.length, 2);
		assertEquals(classRecommendations[0], "Paladin");
		assertEquals(classRecommendations[1], "Rogue");
	}
}
