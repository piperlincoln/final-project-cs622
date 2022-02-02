///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the generic class with special trait information.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import charactergeneration.GenericTraitContainer;

public class GenericTraitContainerTest {
	
	private GenericTraitContainer<Integer> intTrait = new GenericTraitContainer<Integer>(60, "The range of Darkvision.");
	private GenericTraitContainer<String> strTrait = new GenericTraitContainer<String>("Battle Axe", "The weapon with the highest damage.");
	
	@Test
	public void getTraitTest() {
		assertEquals((int)intTrait.getTrait(), 60);
		assertEquals((String)strTrait.getTrait(), "Battle Axe");
	}
	
	@Test
	public void getDescription() {
		assertEquals(intTrait.getDescription(), "The range of Darkvision.");
		assertEquals(strTrait.getDescription(), "The weapon with the highest damage.");
	}
}
