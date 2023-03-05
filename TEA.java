// https://www.codechef.com/problems/TEA
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    int res1 = x/y;
		    if(x%y!=0){
		        System.out.println((res1+1)*z);
		    }else{
		        System.out.println(res1*z);
		    }
		}
	}
}
