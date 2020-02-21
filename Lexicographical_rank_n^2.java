/******************************************************************************
Lexicographical rank of a string in O(n^2) time
*******************************************************************************/
public class Main
{
    public static int fact(int n)
    {
         return (n == 1 || n == 0) ? 1 : n * fact(n - 1); 
    }
	public static void main(String[] args) {
		String s = "bac";
		int l = s.length();
		int count=0;
		for(int i=0;i<l-1;i++)
		{
		    int k=0;
		  for(int j = i+1;j<l;j++)
		  {
		      if(s.charAt(i) > s.charAt(j))
		      {
		          k++;
		      }
		  }
		  count+=fact(l-i-1)*k;
		}
		System.out.println(count+1);
	}
}
