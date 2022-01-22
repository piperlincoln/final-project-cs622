///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Bard class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Bard class in Dungeons and Dragons. 
 */
public class Bard extends DndClass{
	
	public Bard() {
		this.dndClass = "Bard";
		this.description = "An inspiring magician whose power echoes the music of creation.";
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