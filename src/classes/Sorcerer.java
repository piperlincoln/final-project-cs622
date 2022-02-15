///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Sorcerer class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Sorcerer class in Dungeons and Dragons. 
 */
public class Sorcerer extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Sorcerer() {
		this.dndClass = "Sorcerer";
		this.description = "A spellcaster who draws on inherent magic from a gift or bloodline.";
		this.hitPoints = 6;
		this.primaryAbility = 5;  // The primary ability of a Sorcerer is Charisma.
		this.proficiencies = new String[] {"Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion"};
		this.recommendedProficiencies = new int[] {0, 1};
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
