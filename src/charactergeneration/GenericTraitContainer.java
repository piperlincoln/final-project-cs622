///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   A generic class for special information about a character.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

/**
 * A generic class to hold special information about a character. 
 */
public class GenericTraitContainer<T> {
	
	private T trait;               // The special trait of the character.
	private String description;    // A description of the special trait.
	
	public GenericTraitContainer(T trait, String description) {
		this.trait = trait;
		this.description = description;
	}
	
	public T getTrait() {
		return this.trait;
	}
	
	public String getDescription() {
		return this.description;
	}
}
