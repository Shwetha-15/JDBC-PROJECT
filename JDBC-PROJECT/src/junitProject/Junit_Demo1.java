package junitProject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class Junit_Demo1 
{
    @Test
    public void display()
    {
    	System.out.println("welcome to Techno Serve!!!!!!!!!!!");
    }
    
    @Disabled
    @Test
    public void display1()
    {
    	System.out.println("welcome to Capgemini!!!!!!!");
    }
}
