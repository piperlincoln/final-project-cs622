///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   The logic to calculate the statistics of the character.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A class to assist with calculating a statistic for a character. 
 */
public class ScoreCalculator {
	
	private final static Random rand = new Random();
	
	/**
	 * Roll a d6 four times, remove the minimum, and sum for the statistic. 
	 */
	public static int calculateStats() {
		ArrayList<Integer> diceRolls = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			diceRolls.add(rollDice());
		}
		diceRolls.remove(Collections.min(diceRolls));
		return diceRolls.stream()
						.mapToInt(Integer::intValue)
						.sum();
	}
	
	/**
	 * Roll a d6 to help determine the statistics of a character. 
	 */
	public static int rollDice() {
		return rand.nextInt(6) + 1;
	}
}
