public class Prime {
	boolean prime=true;
	int n;
	boolean isPrime(int n)
	{
		this.n=n;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		return prime;
	}
	public int isPrime() {
		return this.n;
	}
}
