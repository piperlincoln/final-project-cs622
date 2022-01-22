///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Ranger class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Ranger class in Dungeons and Dragons. 
 */
public class Ranger extends DndClass{
	
	public Ranger() {
		this.dndClass = "Ranger";
		this.description = "A warrior who combats threats on the edges of civilization.";
		this.hitPoints = 10;
		this.primaryAbility = "Dexterity";
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