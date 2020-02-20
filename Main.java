//program to compute all substring of a String



import java.util.*;
public class Main
{
   public static ArrayList<String> ans = new ArrayList<String>();
	public static void main(String[] args) {
		String s = "abcd";
	String a= "";
		generate(s, a);
		System.out.print(ans);
	}
	
	public static  void generate(String s, String a)
	{
	    if(s.length() == 0)
	    {
	        ans.add(a);
	        return;
	    }
	    
	    generate(s.substring(1), s.charAt(0)+a);
	    generate(s.substring(1), a);
	    
	}
}

