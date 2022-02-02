///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The class for the D&D character Gnome race.
///////////////////////////////////////////////////////////////////////////////

package races;

import java.util.ArrayList;

import charactergeneration.GenericTraitContainer;

/**
 * The Gnome race in Dungeons and Dragons. 
 */
public class Gnome extends DndRace { 
	
	public Gnome() {
		this.race = "Gnome";
		this.description = "A gnome’s energy and enthusiasm for living shines "
				+ "through every inch of his or her tiny body.";
		this.languages[1] = "Gnomish";
		this.traits = new String[] {"Gnome Cunning", 
									"Superior Darkvision", 
									"Stone Camouflage", 
									"Artificer’s Lore", 
									"Tinker"};
		
		// The special trait of the Gnome race is the variety of Gnome types.
		ArrayList<String> gnomishTypes = new ArrayList<String>(); 
		gnomishTypes.add("Deep");
		gnomishTypes.add("Rock");
		this.specialTrait = new GenericTraitContainer<ArrayList<String>>(
			gnomishTypes, "The variants of the Gnome race.");
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
	public GenericTraitContainer<?> getSpecialTrait() {
		return this.specialTrait;
	}
}
