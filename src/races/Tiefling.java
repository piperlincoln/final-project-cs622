///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Tiefling race.
///////////////////////////////////////////////////////////////////////////////

package races;

/**
 * The Tiefling race in Dungeons and Dragons. 
 */
public class Tiefling extends DndRace {
	
	public Tiefling() {
		this.race = "Tiefling";
		this.description = "To be greeted with stares and whispers, to suffer "
				+ "violence and insult on the street, to see mistrust and fear "
				+ "in every eye: this is the lot of the Tiefling.";
		this.languages[1] = "Infernal";
		this.traits = new String[] {"Darkvision", 
									"Hellish Resistance", 
									"Infernal Legacy"};
	}
	
	public String getRace() {
		return this.race;
	}
	public String getDescription() {
		return this.description;
	}
	public String[] getLanguages() {
		return this.languages;
	}
	public String[] getTraits() {
		return this.traits;
	}
}
