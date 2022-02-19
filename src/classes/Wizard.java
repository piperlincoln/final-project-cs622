///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Wizard class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Wizard class in Dungeons and Dragons. 
 */
public class Wizard extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Wizard() {
		this.dndClass = "Wizard";
		this.description = "A scholarly magic-user capable of manipulating the structures of reality.";
		this.hitPoints = 6;
		this.primaryAbility = 3;  // The primary ability of a Wizard is Intelligence.
		this.proficiencies = new String[] {"Arcana", "History", "Insight", "Investigation", "Medicine", "Religion"};
		this.recommendedProficiencies = new int[] {0, 4};
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
