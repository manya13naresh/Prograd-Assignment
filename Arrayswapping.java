import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Collections;

class Main {
    public static void main(String args[]) {
        int num,element;
        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            ArrayList<Integer> arrli = new ArrayList<Integer>(num);
            for(int i=0;i<num;i++)
            {
                element=sc.nextInt();
                arrli.add(element);
            }
           
             for (int j = 0; j <num-1; j=j+2)
                    Collections.swap(arrli, j, j+1);
             System.out.print(arrli);
             }
    }
    
