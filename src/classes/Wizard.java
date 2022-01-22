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
public class Wizard extends DndClass{
	
	public Wizard() {
		this.dndClass = "Wizard";
		this.description = "A scholarly magic-user capable of manipulating the structures of reality.";
		this.hitPoints = 6;
		this.primaryAbility = "Intelligence";
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