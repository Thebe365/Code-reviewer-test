package sayTheNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SayNumberTest {

	@Test
    public void testSayNumber() {
		
		// test a unit number
        assertEquals("fourteen", SayNumber.sayNumber(14));
        
        // Test a negative number
        assertEquals("minus fourteen", SayNumber.sayNumber(-14));
        
        // Test a large number
        assertEquals("one hundred and twenty-three million four hundred and "
        			+ "fifty-six thousand seven hundred and eighty-nine", 
        			SayNumber.sayNumber(123456789));
        
        // Test zero
        assertEquals("zero", SayNumber.sayNumber(0));
    }

}
