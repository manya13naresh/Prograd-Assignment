import java.util.*;
public class Main {

static int checkDate(String str1)
   {
      HashSet<String> set=new HashSet<String>();  
       String changable="";
       int count=0;
       for(int i=0;i<str1.length();i++)
       {
           if(str1.charAt(i)=='-')
           {
               count++;
               if(count%2==0)
               {
                   for(int j=1;j<5;j++)
                   {
                       changable+=str1.charAt(i+j);
                   }
                   
                   set.add(changable);
                   changable="";
               }
           }
       }
     
       return set.size();
   }
public static void main(String[] args)
{
Scanner obj =new Scanner(System.in);
String str =obj.next();
System.out.println(checkDate(str));
}
}
