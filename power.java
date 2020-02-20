//power using recursion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n = 3, p = 3;
		long res = pow(n,p);
		System.out.println(res);
	}
	
	public static long pow(int n, int p)
	{
	    if(p == 0)
	    {
	        return 1;
	    }
	    else{
	        if((p&1) == 1)
	        {
	            return n*pow(n,p-1);
	        }
	        return pow(n, p/2) * pow(n, p/2);
	    }
	}
}

