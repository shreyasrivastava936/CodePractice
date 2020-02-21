/******************************************************************************

                 Program to Check if Two Strings are anagram or Not
                                (Permutation of each other)

*******************************************************************************/

public class Main
{
    public static boolean check(String s, String r)
    {
        int a[] = new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]++;
        }
        for(int i=0;i<r.length();i++)
        {
            a[r.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
          if(a[i] != 0)
          {
              return false;
          }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
	String s = "geeks";
	String r = "eekog";
	
	
	System.out.println(check(s, r));
	}
}
