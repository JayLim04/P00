import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {
	public int add (int a,int b) {
		return a+b;
	}
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
