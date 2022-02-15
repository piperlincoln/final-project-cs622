///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Paladin class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Paladin class in Dungeons and Dragons. 
 */
public class Paladin extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Paladin() {
		this.dndClass = "Paladin";
		this.description = "A holy warrior bound to a sacred oath.";
		this.hitPoints = 10;
		this.primaryAbility = 2;  // The primary ability of a Paladin is Dexterity.
		this.proficiencies = new String[] {"Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion"};
		this.recommendedProficiencies = new int[] {4, 5};
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
