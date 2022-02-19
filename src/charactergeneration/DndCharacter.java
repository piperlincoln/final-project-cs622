///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The base class for a D&D character.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.util.Arrays;

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
	
	private int[] statistics = new int[6];  // Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma
	
	public DndCharacter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
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
	
	public String getBackground() {
		return background.split(":")[0];
	}
	
	public void setBackground(String background) {
		this.background = background;
	}
	
	public int[] getStatistics() {
		return this.statistics;
	}
	
	/**
	 * Calculate the six statistics for the character.
	 */
	public void calculateStatistics() {
		// Calculate each of the six statistics.
		int maxScoreIndex = 0;
		for (int i = 0; i < 6; i++) {
			statistics[i] = new ScoreCalculator().calculateStats();
			if (statistics[i] > statistics[maxScoreIndex]) {
				maxScoreIndex = i;
			}
		}
		
		// Assign the maximum sum to the primary statistic of the class.
		int scoreOne = statistics[maxScoreIndex];
		int scoreTwo = statistics[this.dndClass.getPrimaryAbility()];
		statistics[this.dndClass.getPrimaryAbility()] = scoreOne;
		statistics[maxScoreIndex] = scoreTwo;
	}
	
	/**
	 * Display information about the character.
	 */
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
		charDescription += "Proficiencies: " + Arrays.toString(dndClass.getProficiencies()) + "\n";
		charDescription += "Background: " + this.getBackground() + "\n";
		charDescription += "Statistics: " + 
				"Strength (" + statistics[0] + "), " +
				"Constitution (" + statistics[1] + "), " +
				"Dexterity (" + statistics[2] + "), " +
				"Intelligence (" + statistics[3] + "), " +
				"Wisdom (" + statistics[4] + "), " +
				"Charisma (" + statistics[5] + ")\n";
		// Only display a special trait if it is applicable to this race.
		if (race.getSpecialTrait() != null) {
			charDescription += "Special Trait: " + race.getSpecialTrait().getTrait() + 
					", Description: " + race.getSpecialTrait().getDescription();
		}
		return charDescription;
	}
}
