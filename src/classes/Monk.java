///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Monk class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Monk class in Dungeons and Dragons. 
 */
public class Monk extends DndClass{
	
	public Monk() {
		this.dndClass = "Monk";
		this.description = "A master of martial arts, harnessing the power of the "
				+ "body in pursuit of physical and spiritual perfection.";
		this.hitPoints = 8;
		this.primaryAbility = 2;  // The primary ability of a Monk is Dexterity.
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
