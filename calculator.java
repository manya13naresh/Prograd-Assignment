import java.util.Scanner;
import java.util.Arrays;
 class checklen 
{
    int strlen(int m){
        try 
        {
            if(m<3)
                throw new Exception();
            else
                return 1;
        } 
        catch(Exception e) 
        {   
            System.out.println("Invalid Input");
            return 0;
        } 
    }
}

class check_operand 
{
    int checkop(char[] arr1){
        try 
        {
            
            if((arr1[0]<=57&&arr1[0]>=48)&&(arr1[2]<=57&&arr1[2]>=48))
            {
                return 1;
                
            }
            else
                throw new Exception();
        } catch(Exception e) 
        {   
            System.out.println("Invalid Input");
            return 0;
        } 
    }
}
class check_operator
{
    int checkops(char[] arr1){
        try 
        {

            if(arr1[1]==42||arr1[1]==43||arr1[1]==45||arr1[1]==47)
            {
                return 1;
                
            }
            else
                throw new Exception();
        }
        catch(Exception e) 
        {   
            System.out.println("Invalid Input");
            return 0;
        } 
    }
}
class ans
{
    int result(String in)
    {
        int[] ch = new int[5];  
        char ch1=0;
        char change=0;
        for(int i=0;i<in.length();i++)
        {   if((i%2)==0){
                
                ch[i]=Character.getNumericValue(in.charAt(i));
            }
               
        
            else
            {
                ch1=in.charAt(i);
            }
        }
        if(ch1=='*'){
        
        return ch[0]*ch[2];
            
        }
        else if(ch1=='+')
        {
            return ch[0]+ch[2];
            }
        else if(ch1=='-')
        {
            return ch[0]-ch[2];
            }
        else if(ch1=='/')
        {
            return ch[0]/ch[2];
            }
        else 
            return 0;
    }
        
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int n= str.length();
		checklen obj1 = new checklen();
		check_operand obj2=new check_operand();
		check_operator obj3=new check_operator();
		ans obj4=new ans();
		char[] arr = str.toCharArray();
		int a=obj1.strlen(n);
		int b=obj2.checkop(arr);
		int c=obj3.checkops(arr);
		if((a==1)&&(b==1)&&(c==1))
		{
		  System.out.println(obj4.result(str));  
		}
	}
}


