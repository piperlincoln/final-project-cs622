///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the ScoreCalculator class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import charactergeneration.ScoreCalculator;
import charactergeneration.ScoreCalculator.RollDice;

public class ScoreCalculatorTest {
	
	@Test
	public void calculateStatsTest() {
		int statistic = new ScoreCalculator().calculateStats();
		assertTrue(statistic > 2);
		assertTrue(statistic < 19);
	}
	
	@Test
	public void rollDiceTest() {
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		RollDice ThreadOne = scoreCalculator.new RollDice(1);
		ThreadOne.start();
		try {
			assertEquals(ThreadOne.getThreadId(), 1);
			ThreadOne.join();
		} catch (InterruptedException e) {}
		assertEquals(scoreCalculator.diceRolls.size(), 1);
	}
}
