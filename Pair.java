import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int count=0;
	    System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the product");
		int k= sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr= new int[n] ;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[i]*arr[j]==k)
		        count++;
		    }
		}
		System.out.println("Number of pairs "+count);

		
	}
}
