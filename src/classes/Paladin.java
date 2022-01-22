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
public class Paladin extends DndClass{
	
	public Paladin() {
		this.dndClass = "Paladin";
		this.description = "A holy warrior bound to a sacred oath.";
		this.hitPoints = 10;
		this.primaryAbility = "Charisma";
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
}