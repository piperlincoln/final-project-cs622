///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Tests for the ScoreCalculator class.
///////////////////////////////////////////////////////////////////////////////

package charactergeneration_test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import charactergeneration.ScoreCalculator;

public class ScoreCalculatorTest {
	
	@Test
	public void calculateStatsTest() {
		int statistic = ScoreCalculator.calculateStats();
		assertTrue(statistic > 2);
		assertTrue(statistic < 19);
	}
	
	@Test
	public void rollDiceTest() {
		int diceRoll = ScoreCalculator.rollDice();
		assertTrue(diceRoll > 0);
		assertTrue(diceRoll < 7);
	}
}
