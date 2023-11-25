import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionTest {

	@Test
	public void Conversion_Test_1() {
		/* Roman roman = new Roman("I");
		 * int n = roman.toArabic();
		 */
		assertEquals(new Roman("I").toArabic(), 1);
	}
	
	@Test
	public void Conversion_Test_2() {
		assertEquals(new Roman("II").toArabic(), 2);
	}
	
	@Test
	public void Conversion_Test_3() {
		assertEquals(new Roman("V").toArabic(), 5);
	}

}
