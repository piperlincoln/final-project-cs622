///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Cleric class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Cleric class in Dungeons and Dragons. 
 */
public class Cleric extends DndClass {
	
	private static final long serialVersionUID = 1L;
	
	public Cleric() {
		this.dndClass = "Cleric";
		this.description = "A priestly champion who wields divine magic in service of a higher power.";
		this.hitPoints = 8;
		this.primaryAbility = 4;  // The primary ability of a Cleric is Wisdom.
		this.proficiencies = new String[] {"History", "Insight", "Medicine", "Persuasion", "Religion"};
		this.recommendedProficiencies = new int[] {1, 4};
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
