import static org.junit.Assert.*;
import org.junit.Test;


public class StringRotationTest {

	@Test
	public void testRotate() {
		StringRotation test = new StringRotation(); 
		assertEquals(test.rotate("abcdef",2), "efabcd");
		assertEquals(test.rotate("abcdef",-2), "cdefab");
		assertEquals(test.rotate("abcdef",7), "fabcde");
		assertEquals(test.rotate("abcdef",6), "abcdef");
		assertEquals(test.rotate("abcdef",0), "abcdef");
		assertEquals(test.rotate("",1), "");
		assertEquals(test.rotate("",-1), "");
		assertEquals(test.rotate("",0), "");
		
	}

}


