package this_n_super;

public class sample2 extends sample3
{
	 //sub-class
    // int a=30;

 int a=20;
 public void M2()
{
	int a=10;                        //local variable
	System.out.println(a); //10
	
	 System.out.println(this.a);   //20  
	 
	 System.out.println(this.a); //20
	 
	 System.out.println(super.a); //30
	
}

 public static void main(String[] args) 
{
	//create object of same class
	sample2 S2=new sample2();
	//call the method
	S2.M2();
	
	sample3 S3=new sample3();
			S3.M10();
}


}
