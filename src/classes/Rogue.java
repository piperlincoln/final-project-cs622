///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Rogue class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Rogue class in Dungeons and Dragons. 
 */
public class Rogue extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Rogue() {
		this.dndClass = "Rogue";
		this.description = "A scoundrel who uses stealth and trickery to overcome obstacles and enemies.";
		this.hitPoints = 8;
		this.primaryAbility = 2;  // The primary ability of a Rogue is Dexterity.
		this.proficiencies = new String[] {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", 
				"Investigation", "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth"};
		this.recommendedProficiencies = new int[] {2, 4};
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
