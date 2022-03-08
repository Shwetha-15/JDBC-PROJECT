package march_3;
public class JunitDemo2 
{
	public static void main(String[] args) 
	{
        int age=18;
        assert age<=18:"can not vote";
        System.out.println("the voter age is : "+age);
	}
}
