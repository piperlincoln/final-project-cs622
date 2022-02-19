///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Half-Orc race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.GenericTraitContainer;

/**
 * The Half-Orc race in Dungeons and Dragons. 
 */
public class HalfOrc extends DndRace { 

	private static final long serialVersionUID = 1L;
	
	public HalfOrc() {
		this.race = "HalfOrc";
		this.description = "Half-orcs’ grayish pigmentation, sloping foreheads, "
				+ "jutting jaws, prominent teeth, and towering builds make their "
				+ "orcish heritage plain for all to see.";
		this.languages[1] = "Orcish";
		this.traits = new String[] {"Darkvision", 
									"Menacing", 
									"Relentless Endurance", 
									"Savage Attacks"};
		this.recommendedClasses = new String[] {"Barbarian", "Ranger"};
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
