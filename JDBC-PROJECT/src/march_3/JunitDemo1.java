package march_3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
public class JunitDemo1 
{
	@Test
	public void Assert()
	{
	    String s1="Junit";
	    String s2="Junit";
	    String s3="Test";
	    String s4=null;
	    
	    int var1=1;
	    int var2=2;
	    
	    
	    assertEquals(s1,s2);  
	    assertTrue(var1 < var2);
	    assertFalse(var1 > var2);
	    assertEquals(s1,s2); 
	    assertSame( s1,s2);
	    assertNotSame(s2, s4);
	    assertNotNull(s1);
	    assertNull(s4);
	    
	}
}
