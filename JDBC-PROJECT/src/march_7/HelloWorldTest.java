package march_7;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class HelloWorldTest 
{
	@Test
	@RepeatedTest(10)
	void test() 
	{
		System.out.println("First Test Case");
	}
}
