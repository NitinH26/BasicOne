package compare;

public class method 
{
	public static void Constructor()
	{
		System.out.println("Constructor1");
	}
	
	public static void Constructor(int a,int b)
	{
		System.out.println("Constructor2");
	}
	
	public static void Constructor(int a,int b,int c)
	{
		System.out.println("Constructor3");
	}
	
	public static void Constructor(int a, String name)
	{
		System.out.println("Constructor4");
	}
	
	public static void main(String[] args) 
	{
		//method s1=new method();
		Constructor();
		Constructor(10,20);
		
	}


}
