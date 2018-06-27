package programmingBasics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void invert() {
		int[] anArray = { 100, 200, 300 };
		int[] resultArray = Arrays.invert(anArray);
		assertEquals(300, resultArray[0]);
		assertEquals(200, resultArray[1]);
		assertEquals(100, resultArray[2]);
	}

}
