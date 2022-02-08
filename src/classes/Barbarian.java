///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Barbarian class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Barbarian class in Dungeons and Dragons. 
 */
public class Barbarian extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Barbarian() {
		this.dndClass = "Barbarian";
		this.description = "A fierce warrior of primitive background who can enter a battle rage.";
		this.hitPoints = 12;
		this.primaryAbility = 0;  // The primary ability of a Barbarian is Strength.
		this.proficiencies = new String[] {"Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"};
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
}
