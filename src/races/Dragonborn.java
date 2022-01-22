///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Dragonborn race.
///////////////////////////////////////////////////////////////////////////////

package races;

/**
 * The Dragonborn race in Dungeons and Dragons. 
 */
public class Dragonborn extends DndRace {
	
	public Dragonborn() {
		this.race = "Dragonborn";
		this.description = "Dragonborn look very much like dragons standing "
				+ "erect in humanoid form, though they lack wings or a tail.";
		this.languages[1] = "Draconic";
		this.traits = new String[] {"Draconic Ancestry", 
									"Breath Weapon", 
									"Damage Resistance"};
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
