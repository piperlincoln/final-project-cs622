///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Dwarf race.
///////////////////////////////////////////////////////////////////////////////

package races;

import java.util.ArrayList;

import charactergeneration.GenericTraitContainer;

/**
 * The Dwarf race in Dungeons and Dragons. 
 */
public class Dwarf extends DndRace {

	private static final long serialVersionUID = 1L;
	
	public Dwarf() {
		this.race = "Dwarf";
		this.description = "Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal.";
		this.languages[1] = "Dwarven";
		this.traits = new String[] {"Darkvision", 
									"Dwarven Resilience", 
									"Dwarven Combat Training", 
									"Tool Proficiency", 
									"Stonecunning", 
									"Dwarven Toughness"};
		
		// The special trait of the Dwarf race is the variety of Dwarf types.
		ArrayList<String> dwarvenTypes = new ArrayList<String>(); 
		dwarvenTypes.add("Hill");
		dwarvenTypes.add("Mountain");
		this.specialTrait = new GenericTraitContainer<ArrayList<String>>(
			dwarvenTypes, "The variants of the Dwarf race.");
		this.recommendedClasses = new String[] {"Paladin", "Rogue"};
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
	public String[] getRecommendation() {
		return this.recommendedClasses;
	}
}
