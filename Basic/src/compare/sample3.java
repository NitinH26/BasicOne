package compare;

public class sample3 implements sample1,sample2
{	//sub class
	//int a=10;
	//int b=20;
	
	int a=50;
	int b=60;
	
	sample3()
	{
		System.out.println("Constructor");
		
	}
	
	
	
	public  void m5()
	{
		int a=200;
		int b=300;
		
		int sum=a+b;
		int s=this.a+this.b;
		System.out.println(sum);
		System.out.println(s);
	}
	public void m1()
	 {
		 System.out.println("home");
	 }
	public void m2()
	 {
		 System.out.println("money");
		 
	 }
	public void m3()
	 {
		 System.out.println("kitchen");
	 }
	public void m4()
	 {
		 System.out.println("frige");
		 
	 }
	public static void main(String[] args) 
	{
		sample3 s1=new sample3();
		s1.m1();
		s1.m2();
		s1.m3();
		s1.m4();
		
		s1.m5();
		
		
	}
}
