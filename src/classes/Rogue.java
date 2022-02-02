///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Rogue class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Rogue class in Dungeons and Dragons. 
 */
public class Rogue extends DndClass{
	
	public Rogue() {
		this.dndClass = "Rogue";
		this.description = "A scoundrel who uses stealth and trickery to overcome obstacles and enemies.";
		this.hitPoints = 8;
		this.primaryAbility = 2;  // The primary ability of a Rogue is Dexterity.
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
