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
public class Warlock extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Warlock() {
		this.dndClass = "Warlock";
		this.description = "A wielder of magic that is derived from a bargain with an extraplanar entity.";
		this.hitPoints = 8;
		this.primaryAbility = 5;  // The primary ability of a Warlock is Charisma.
		this.proficiencies = new String[] {"Arcana", "Deception", "History", "Intimidation", 
				"Investigation", "Nature", "Religion"};
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
