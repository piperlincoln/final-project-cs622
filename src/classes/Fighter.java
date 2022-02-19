///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Fighter class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Fighter class in Dungeons and Dragons. 
 */
public class Fighter extends DndClass {
	
	private static final long serialVersionUID = 1L;
	
	public Fighter() {
		this.dndClass = "Fighter";
		this.description = "A master of martial combat, skilled with a variety of weapons and armor.";
		this.hitPoints = 10;
		this.primaryAbility = 0;  // The primary ability of a Fighter is Strength.
		this.proficiencies = new String[] {"Acrobatics", "Animal Handling", "Athletics", "History", 
				"Insight", "Intimidation", "Perception", "Survival"};
		this.recommendedProficiencies = new int[] {2, 7};
	}
	
	public String getDndClass() {
		return this.dndClass;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String[] getProficiencies() {
		return this.proficiencies;
	}
	
	public void setProficiencies(String[] proficiencies) {
		this.proficiencies = proficiencies;
	}
	
	public int getPrimaryAbility() {
		return this.primaryAbility;
	}
	
	public String[] getRecommendation() {
		String[] proficiencyList = new String[this.recommendedProficiencies.length];
		for (int i = 0; i < proficiencyList.length; i++) {
			proficiencyList[i] = this.proficiencies[this.recommendedProficiencies[i]];
		}
		return proficiencyList;
	}
}
