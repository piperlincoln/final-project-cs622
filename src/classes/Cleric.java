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
public class Cleric extends DndClass{
	
	public Cleric() {
		this.dndClass = "Cleric";
		this.description = "A priestly champion who wields divine magic in service of a higher power.";
		this.hitPoints = 8;
		this.primaryAbility = 4;  // The primary ability of a Cleric is Wisdom.
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
