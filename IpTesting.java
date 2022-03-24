import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;


public class IpTesting {
	@Test
	public void falseTest()
	{
		assertFalse(IPvalidation.validate("0.0.0.0"));
		assertFalse(IPvalidation.validate("255.255.255.255"));
			}
	@Test
	public void TrueTest()
	{
		assertTrue(IPvalidation.validate("198.167.1.1"));
		assertTrue(IPvalidation.validate("10.0.1.1"));
	}
}

