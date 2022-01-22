///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Dwarf race.
///////////////////////////////////////////////////////////////////////////////

package races;

/**
 * The Dwarf race in Dungeons and Dragons. 
 */
public class Dwarf extends DndRace {
	
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
}
