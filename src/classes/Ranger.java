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
public class Ranger extends DndClass {

	private static final long serialVersionUID = 1L;
	
	public Ranger() {
		this.dndClass = "Ranger";
		this.description = "A warrior who combats threats on the edges of civilization.";
		this.hitPoints = 10;
		this.primaryAbility = 2;  // The primary ability of a Ranger is Dexterity.
		this.proficiencies = new String[] {"Animal Handling", "Athletics", "Insight", "Investigation", 
				"Nature", "Perception", "Stealth", "Survival"};
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
