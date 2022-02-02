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
public class Fighter extends DndClass{
	
	public Fighter() {
		this.dndClass = "Fighter";
		this.description = "A master of martial combat, skilled with a variety of weapons and armor.";
		this.hitPoints = 10;
		this.primaryAbility = 0;  // The primary ability of a Fighter is Strength.
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
