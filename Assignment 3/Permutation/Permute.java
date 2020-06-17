public class Permute { 
    public static void printPermutn(String temp , String ans)
    {
    	if(temp.equals(""))
    		System.out.println(ans);
    	for(int i=0;i<temp.length();i++)
    	{
    		char c=temp.charAt(i);
    		String st=temp.substring(0,i)+temp.substring(i+1);
    		printPermutn(st,ans+c);
    	}
    	
    }	
} 
