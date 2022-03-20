import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main
{
    
    static int factorial(int m)
    {
        int f=1;
        for(int i=1;i<=m;i++)
        {
            f=f*i;
        }
        return f;
    }
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int n = str.length();
		int fact=1;
		int[] strfre= new int [26];
		for(int i=0;i<n;i++)
		{
		    strfre[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
		    fact=fact*factorial(strfre[i]);
		}
		System.out.println(factorial(n)/fact);
	}
}
