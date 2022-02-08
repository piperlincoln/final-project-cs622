///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Elf race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.GenericTraitContainer;

/**
 * The Elf race in Dungeons and Dragons. 
 */
public class Elf extends DndRace { 

	private static final long serialVersionUID = 1L;
	
	public Elf() {
		this.race = "Elf";
		this.description = "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it.";
		this.languages[1] = "Elvish";
		this.traits = new String[] {"Darkvision", 
									"Keen Senses", 
									"Fey Ancestry", 
									"Trance", 
									"Elf Weapon", 
									"Training", 
									"Fey Step"};
		
		// The special trait of the Elf race is the weapon they are proficient with.
		this.specialTrait = new GenericTraitContainer<String>("Longsword", "The weapon this character is proficient with.");
	}
	
	public String getRace() {
		return this.race;
	}
	public String getDescription() {
		return this.description;
	}
	public String[] getLanguages() {
		return this.languages;
	}
	public String[] getTraits() {
		return this.traits;
	}
	public GenericTraitContainer<?> getSpecialTrait() {
		return this.specialTrait;
	}
}
