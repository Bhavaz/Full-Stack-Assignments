import java.util.Scanner;

class Test
{

public static void main(String[] args) 
   {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Fibonacci fib=new Fibonacci();
	for(int i=0;fib.Fib(i)<n;i++)
		System.out.print(fib.Fib(i)+" ");
	
   }
}
