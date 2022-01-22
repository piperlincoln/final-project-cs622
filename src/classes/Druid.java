///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The D&D character Druid class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * The Druid class in Dungeons and Dragons. 
 */
public class Druid extends DndClass{
	
	public Druid() {
		this.dndClass = "Druid";
		this.description = "A priest of the Old Faith, wielding the powers of nature and adopting animal forms.";
		this.hitPoints = 8;
		this.primaryAbility = "Wisdom";
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