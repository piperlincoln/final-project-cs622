///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The base class for a D&D character class.
///////////////////////////////////////////////////////////////////////////////

package classes;

/**
 * A character class in Dungeons and Dragons. 
 */
public abstract class DndClass {
	
	protected String dndClass;         // The name of the class.
	protected String description;      // The description of the class.
	protected int hitPoints;           // The initial health level of the class.
	protected String primaryAbility;   // The primary statistic of the class.
	protected String[] proficiencies;  // The technical proficiencies of the class.
	
	public DndClass() {

	}
	
	public abstract String getDndClass();
	public abstract String getDescription();
	public abstract String[] getProficiencies();
	public abstract void setProficiencies(String[] proficiencies);
}