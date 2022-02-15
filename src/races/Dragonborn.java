///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Dragonborn race.
///////////////////////////////////////////////////////////////////////////////

package races;

import java.util.HashMap;

import charactergeneration.GenericTraitContainer;

/**
 * The Dragonborn race in Dungeons and Dragons. 
 */
public class Dragonborn extends DndRace {

	private static final long serialVersionUID = 1L;
	
	public Dragonborn() {
		this.race = "Dragonborn";
		this.description = "Dragonborn look very much like dragons standing "
				+ "erect in humanoid form, though they lack wings or a tail.";
		this.languages[1] = "Draconic";
		this.traits = new String[] {"Draconic Ancestry", 
									"Breath Weapon", 
									"Damage Resistance"};
		
		// The special trait of the Dragonborn race is the variety of colors and essences.
		HashMap<String, String> draconicTypes = new HashMap<String, String>();
		draconicTypes.put("Green", "Acid");
		draconicTypes.put("Blue", "Lightning");
		draconicTypes.put("Gold", "Fire");
		this.specialTrait = new GenericTraitContainer<HashMap<String, String>>(
			draconicTypes, "The variants of the Dragonborn race.");
		this.recommendedClasses = new String[] {"Barbarian", "Bard", "Fighter", "Paladin", "Sorcerer", "Warlock"};
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
