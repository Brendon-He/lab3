import static org.junit.Assert.*;
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
  public void testReversedMultipleNumbers() {
    int[] input1 = { 3, 5 , 6, 7 };
    assertArrayEquals(new int[]{7,6,5,3 }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceMultipleNumbers() {
    int[] input1 = { 3, 5 , 6, 7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 7,6,5,3 }, input1);
	}

  @Test
  public void testAverageWithoutLowest(){
    double emptyArr[]={};
    assertEquals(0.0,ArrayExamples.averageWithoutLowest(emptyArr),0.00005);
    double oneLowest[]={3.0,4.0,5.0,6.0,7.0};
    assertEquals(5.5,ArrayExamples.averageWithoutLowest(oneLowest),0.00005);
    double multipleLowest[]={3.0,3.0,4.0,5.0,6.0,7.0};
    assertEquals(5.0,ArrayExamples.averageWithoutLowest(multipleLowest),0.00005);
  }
}
