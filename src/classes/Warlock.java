///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Warlock class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Warlock class in Dungeons and Dragons. 
 */
public class Warlock extends DndClass{
	
	public Warlock() {
		this.dndClass = "Warlock";
		this.description = "A wielder of magic that is derived from a bargain with an extraplanar entity.";
		this.hitPoints = 8;
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