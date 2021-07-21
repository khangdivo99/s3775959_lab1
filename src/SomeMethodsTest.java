import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeMethodsTest {

	@Test
	void testWeight_index() {
		assertEquals(SomeMethods.weight_index(9, 3), 1);
		assertEquals(SomeMethods.weight_index(25, 5), 1);
		assertEquals(SomeMethods.weight_index(4, 2), 1);
		assertEquals(SomeMethods.weight_index(16, 4), 1);
		
	}

}
