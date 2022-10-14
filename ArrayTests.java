import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {1,3,4,5,6,9};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{9,6,5,4,3,1}, input);

  }

  @Test
  public void testaverageWithoutLowest(){
    double[] input1 = {3,4,6,1,2};
    double[] input2 = {1};
    double[] input3 = {1,2,3,1,1};
    assertEquals(3.75,ArrayExamples.averageWithoutLowest(input1),0.001);
    assertEquals(0.0,ArrayExamples.averageWithoutLowest(input2),0.001);
    assertEquals(2.5,ArrayExamples.averageWithoutLowest(input3),0.001);

  }
}
