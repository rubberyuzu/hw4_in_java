import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionRotationTest {
    

	@Test
	public void testRotate() {
		CollectionRotation<Integer> test = new CollectionRotation<Integer>();
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> listExp = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        ArrayList<Integer> listEmp = new ArrayList<Integer>();
        assertEquals(test.rotate(list, 0), list);
        assertEquals(test.rotate(list, 4), listExp);
        assertEquals(test.rotate(list, 5), list);
        assertEquals(test.rotate(list, -1), listExp);
        assertEquals(test.rotate(list, 9), listExp);
        assertEquals(test.rotate(list, 1), listExp);
        assertEquals(test.rotate(listEmp, 1), listEmp);
        assertEquals(test.rotate(listEmp, 0), listEmp);
        assertEquals(test.rotate(listEmp, -1), listEmp);
        assertEquals(test.rotate(listEmp, 10), listEmp);
	}

}
