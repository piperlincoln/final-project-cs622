///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Halfling race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.GenericTraitContainer;

/**
 * The Halfling race in Dungeons and Dragons. 
 */
public class Halfling extends DndRace {

	private static final long serialVersionUID = 1L;
	
	public Halfling() {
		this.race = "Halfling";
		this.description = "The diminutive halflings survive in a world full of "
				+ "larger creatures by avoiding notice or, barring that, avoiding offense.";
		this.languages[1] = "Luiric";
		this.traits = new String[] {"Lucky", 
									"Brave", 
									"Halfling Nimbleness", 
									"Naturally Stealthy"};
		this.recommendedClasses = new String[] {"Barbarian", "Cleric", "Rogue"};
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
