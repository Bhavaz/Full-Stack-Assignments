import java.math.*;
import java.util.*;

class Test
{	
	public static void main(String []args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n>=1 && n<=20)
	    {
	    	List<BigDecimal> bigDecimalReverse = new ArrayList<>();
	    	for(int i=0;i<n;i++)
	    	{
	    		bigDecimalReverse.add(new BigDecimal(sc.next()));
	    	}
	    	Collections.sort(bigDecimalReverse,Collections.reverseOrder());
	    	System.out.println(bigDecimalReverse);
	    	
	    }

	}
}

