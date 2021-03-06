///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The base class for a D&D character race.
///////////////////////////////////////////////////////////////////////////////

package races;

import java.io.Serializable;

import charactergeneration.GenericTraitContainer;

/**
 * A character race in Dungeons and Dragons. 
 */
public abstract class DndRace implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String race;           // The name of the race.
	protected String description;    // The description of the race.
	protected String[] languages;    // The languages spoken by the race.
	protected String[] traits;       // The primary traits of the race.
	
	protected String[] recommendedClasses;    // The recommended classes for this race.
	
	/**
	 * A special trait about this race. 
	 */
	protected GenericTraitContainer<?> specialTrait;
	
	public DndRace() {
		this.languages = new String[2]; 
		this.languages[0] = "Common";
	}
	
	public abstract String getRace();
	public abstract String getDescription();
	public abstract String[] getLanguages();
	public abstract String[] getTraits();
	public abstract GenericTraitContainer<?> getSpecialTrait();
	public abstract String[] getRecommendation();
}
