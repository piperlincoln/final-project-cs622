///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A factory for instantiating the correct D&D race.
///////////////////////////////////////////////////////////////////////////////

package races;

import charactergeneration.UserInputException;

public class DndRaceFactory {
	public DndRace newRace(String race) throws UserInputException {
		if ("Dwarf".equalsIgnoreCase(race))
			return new Dwarf();
		if ("Elf".equalsIgnoreCase(race))
			return new Elf();
		if ("Halfling".equalsIgnoreCase(race))
			return new Halfling();
		if ("Human".equalsIgnoreCase(race))
			return new Human();
		if ("Dragonborn".equalsIgnoreCase(race))
			return new Dragonborn();
		if ("Gnome".equalsIgnoreCase(race))
			return new Gnome();
		if ("Half-Elf".equalsIgnoreCase(race))
			return new HalfElf();
		if ("Half-Orc".equalsIgnoreCase(race))
			return new HalfOrc();
		if ("Tiefling".equalsIgnoreCase(race))
			return new Tiefling();
		throw new UserInputException("Unknown Race: " + race);
  }
}
