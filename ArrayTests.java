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
  public void testReverseInPlace_bug() {
      int[] arr = {1, 2, 3, 4, 5};
      int[] rev = {5, 4, 3, 2, 1};
      
      // Call the method with errors
      ArrayExamples.reverseInPlace(arr);
      
      // Check if the array has been reversed in place
      assertArrayEquals(rev, arr);
  }



}
