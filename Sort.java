//program to check if array is sorted or not using recursion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int a[] = {0,2,3,4,5,6,7};
	int n = a.length;
	System.out.println(isSorted(a, n));
	}
	
	public static boolean isSorted(int a[], int l)
	{
	    if(l==1)
	    {
	        return true;
	    }
	    if(a[l-1] > a[l-2])
	    {
	      return  isSorted(a, l-1);
	    }
	    
	        return false;
	    
	}
}

