
public class Constructor 
{
	Constructor()
	{	this (10,20);
		System.out.println("Constructor1");
	}
	
		int q;
	Constructor(int a,int b)
	{	
		this (800,"nitin");
		
		q=600;
	System.out.println(q);
		System.out.println("Constructor2");
	}
	
	Constructor(int a,int b,int c)
	{	this ();
		int p=500;
		System.out.println(p);
		System.out.println("Constructor3");
	}
	
	Constructor(int a, String name)
	{
		System.out.println("Constructor4");
	}
	
	public static void main(String[] args) 
	{
		Constructor s1=new Constructor(10,20,30);
		//s1.Constructor(10,20);
		//Constructor s2=new Constructor(10,20);
		//Constructor(10,20);
		//System.out.println("dytdytfh");
	}

}
