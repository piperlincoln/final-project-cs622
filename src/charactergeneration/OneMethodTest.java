package charactergeneration;
///////////////////////////////////////////////////////////////////////////////
//   
// Author:        Piper Lincoln
// Class:         Spring 2022 O1 CS 622
// Description:   Interim Assignment 1 Part B
///////////////////////////////////////////////////////////////////////////////

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneMethodTest {

	@Test
	void test() {
		OneMethod testObject = new OneMethod();
		assertEquals(1, testObject.oneMethod());
	}
}
