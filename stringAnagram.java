
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String str1 = "bab";
    String str2 = "abb";
    int n1=str1.length();
    int n2=str2.length();
    int m=0;
    

    if(n1!=n2)
    {
        System.out.println("Not anagram");
    }
    else
    {

      char[] arr1 = str1.toCharArray();
      char[] arr2 = str2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      for(int i=0;i<n1;i++)
      {
          if(arr1[i]!=arr2[i])
            m=1;
      }
      if(m==1)
      System.out.println("Not anagram");
      else
      System.out.println("Anagram");
  }
}
}
