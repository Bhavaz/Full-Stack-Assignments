import java.util.Scanner;

class Test
{

public static void main(String[] args) 
   {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Prime p=new Prime();
	System.out.println(p.isPrime(n)?"Yes "+p.isPrime()+" is prime":"No "+p.isPrime()+" is not a prime");
   }
}
