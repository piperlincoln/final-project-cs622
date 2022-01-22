///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The base class for a D&D character.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.util.Arrays;
import java.util.Random;

import classes.DndClass;
import races.DndRace;
import races.Human;

/**
 * A Dungeons and Dragons character.
 */
public class DndCharacter {
	
	private String name;
	private String background;
	private DndRace race;
	private DndClass dndClass;
	
	private int strength;
	private int constitution;
	private int dexterity;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	private final Random rand = new Random();
	
	/**
	 * Constructor for the base character. 
	 */
	public DndCharacter(String name) {
		this.name = name;
	}
	
	public String getRace() {
		return race.getRace();
	}
	
	public void setRace(DndRace race) {
		this.race = race;
	}
	
	public String getDndClass() {
		return dndClass.getDndClass();
	}
	
	public void setDndClass(DndClass dndClass) {
		this.dndClass = dndClass;
	}
	
	public String display() {
		String charDescription = "";
		charDescription += "Name: " + name + "\n";
		charDescription += "Race: " + race.getRace() + "\n";
		charDescription += "Class: " + dndClass.getDndClass() + "\n";
		// Humans can only speak one language, so only display the first entry in the array.
		if (race instanceof Human) {
			charDescription += "Languages: " + race.getLanguages()[0] + "\n";
		} else {
			charDescription += "Languages: " + Arrays.toString(race.getLanguages()) + "\n";
		}
		charDescription += "Traits: " + Arrays.toString(race.getTraits()) + "\n";
		return charDescription;
	}
	
	/**
	 * Roll a d20 to help determine the statistics of the character. 
	 */
	public int rollDice() {
		return rand.nextInt(20) + 1;
	}
}