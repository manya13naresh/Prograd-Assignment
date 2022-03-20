import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		char[] arr = str.toCharArray();
		int i=0,flag=0;
		for(i=0;i<n-1;i=i+2)
		{
		   
		      if((arr[i]=='P'&&arr[i+1]=='R')||(arr[i]=='R'&&arr[i+1]=='P'))
		        {
		            flag=1;
		        }
		        else
		        {
		            flag=0;
		        }
		}
		
		if(flag==0)
		    System.out.println("Not perfect");
		 else
		    System.out.println("Perfect");
	}
}
