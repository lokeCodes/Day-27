// https://www.codechef.com/problems/SST
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
		    int x = 10*(s.nextInt());
		    int y = 5*(s.nextInt());
		    if(x>y){
		        System.out.println("FIRST");
		    }else if(y>x){
		        System.out.println("SECOND");
		    }else{
		        System.out.println("ANY");
		    }
		    
		}
	}
}
