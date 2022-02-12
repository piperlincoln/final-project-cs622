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
	
	public final Random rand = new Random();
	public ArrayList<Integer> diceRolls = new ArrayList<>();
	
	/**
	 * Roll a d6 four times, remove the minimum, and sum for the statistic. 
	 */
	public int calculateStats() {
		// Initialize the threads that will simulate each dice roll.
		Thread ThreadOne = new RollDice(1);
		Thread ThreadTwo = new RollDice(2);
		Thread ThreadThree = new RollDice(3);
		Thread ThreadFour = new RollDice(4);
		
		// Start rolling the dice.
		ThreadOne.start();
		ThreadTwo.start();
		ThreadThree.start();
		ThreadFour.start();
		
		// Wait for the dice rolling to finish before evaluating for the minimum number.
		try {
			ThreadOne.join();
			ThreadTwo.join();
			ThreadThree.join();
			ThreadFour.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Remove the minimum number from the dice rolls.
		diceRolls.remove(Collections.min(diceRolls));
		return diceRolls.stream()
						.mapToInt(Integer::intValue)
						.sum();
	}
	
	/**
	 * A class that can be used to concurrently roll a d6
	 * to help determine the statistics of a character. 
	 */
	public class RollDice extends Thread {
		private int threadId;
		
		public RollDice(int threadId) {
			this.threadId = threadId;
		}
		
		public int getThreadId() {
			return this.threadId;
		}
		
		@Override
		public void run() {
			synchronized(diceRolls) {
				diceRolls.add(rand.nextInt(6) + 1);
			}
		}
	}
}
