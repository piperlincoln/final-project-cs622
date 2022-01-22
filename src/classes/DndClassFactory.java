///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A factory for instantiating the correct D&D class.
///////////////////////////////////////////////////////////////////////////////

package classes;

public class DndClassFactory {
	public DndClass newClass(String dndClass) throws IllegalArgumentException {
		if ("Barbarian".equalsIgnoreCase(dndClass))
			return new Barbarian();
		if ("Bard".equalsIgnoreCase(dndClass))
			return new Bard();
		if ("Cleric".equalsIgnoreCase(dndClass))
			return new Cleric();
		if ("Druid".equalsIgnoreCase(dndClass))
			return new Druid();
		if ("Fighter".equalsIgnoreCase(dndClass))
			return new Fighter();
		if ("Monk".equalsIgnoreCase(dndClass))
			return new Monk();
		if ("Paladin".equalsIgnoreCase(dndClass))
			return new Paladin();
		if ("Ranger".equalsIgnoreCase(dndClass))
			return new Ranger();
		if ("Rogue".equalsIgnoreCase(dndClass))
			return new Rogue();
		if ("Sorcerer".equalsIgnoreCase(dndClass))
			return new Sorcerer();
		if ("Warlock".equalsIgnoreCase(dndClass))
			return new Warlock();
		if ("Wizard".equalsIgnoreCase(dndClass))
			return new Wizard();
		throw new IllegalArgumentException("Unknown Class: " + dndClass);
  }
}