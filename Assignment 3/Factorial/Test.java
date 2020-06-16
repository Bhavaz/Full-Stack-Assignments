import java.util.Scanner;

class Test
{

public static void main(String[] args) 
   {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Factorial f=new Factorial();
	System.out.println("Factorial of "+n+" is "+f.fact(n));
   }
}
