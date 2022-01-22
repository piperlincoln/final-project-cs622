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
public class Sorcerer extends DndClass{
	
	public Sorcerer() {
		this.dndClass = "Sorcerer";
		this.description = "A spellcaster who draws on inherent magic from a gift or bloodline.";
		this.hitPoints = 6;
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