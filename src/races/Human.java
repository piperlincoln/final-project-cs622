///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Human race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.GenericTraitContainer;

/**
 * The Human race in Dungeons and Dragons. 
 */
public class Human extends DndRace {

	private static final long serialVersionUID = 1L;
	
	public Human() {
		this.race = "Human";
		this.description = "Humans are the most adaptable and ambitious people "
				+ "among the common races. Whatever drives them, humans are the "
				+ "innovators, the achievers, and the pioneers of the worlds.";
		this.traits = new String[] {"+1 to All Ability Scores", 
									"Extra Language"};
		this.recommendedClasses = new String[] {"Cleric", "Fighter"};
	}
	
	public String getRace() {
		return this.race;
	}
	public String getDescription() {
		return this.description;
	}
	public String[] getLanguages() {
		return super.languages;
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
