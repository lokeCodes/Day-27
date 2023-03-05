// https://www.codechef.com/problems/QUALIFY
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
		    int a = s.nextInt();
		    int b = 2*(s.nextInt());
		    int res1 = a+b;
		    String res = (res1>=x) ? "Qualify" : "NotQualify";
		    System.out.println(res);
		}
	}
}
