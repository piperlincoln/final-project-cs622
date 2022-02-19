///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Half-Elf race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.GenericTraitContainer;

/**
 * The Half-Elf race in Dungeons and Dragons. 
 */
public class HalfElf extends DndRace {

	private static final long serialVersionUID = 1L;
	
	public HalfElf() {
		this.race = "HalfElf";
		this.description = "Half-elves combine what some say are the best "
				+ "qualities of their elf and human parents.";
		this.languages[1] = "Elvish";
		this.traits = new String[] {"Darkvision", 
									"Fey Ancestry", 
									"Skill Versatility"};
		this.recommendedClasses = new String[] {"Cleric", "Fighter", "Monk", "Ranger", "Rogue"};
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
		return null;
	}
	
	public String[] getRecommendation() {
		return this.recommendedClasses;
	}
}
