///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Exception that is thrown if user input is not the right type.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

/**
 * The exception that is thrown if user input is not the correct type. 
 */
public class UserInputException extends Exception {
	
	private final String errorMessage;
	
	public UserInputException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String toString(){ 
		return ("Error: User Input Must be Integer from List. " + errorMessage) ;
	}
}
