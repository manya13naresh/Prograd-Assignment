import java.util.*;
public class Main
{
    public static void balanceBracket(String str1)
    {
    Stack<Character> stack = new Stack<Character>();
    int n=str1.length();
    for(int i=0;i<n;i++)
    {
    char ch = str1.charAt(i);
    
    if(ch=='['|| ch=='{'||ch=='(')
    {
        stack.push(ch);
    }
    else if(ch==']'||ch=='}'||ch==')')
    {
    	if(ch==']')
    		stack.remove('[');
    	else if(ch=='}')
            stack.remove('{');
    	else if(ch==')')
            stack.remove('(');
    	
    	
    }
}

if(stack.isEmpty()){
    System.out.println("Balanced");
}
else{
    
        System.out.println(stack);
        if(stack.contains('('))
        str1= str1+')' ;
    
        if(stack.contains('{'))
        str1= str1+'}' ;
    
        if(stack.contains('['))
        str1= str1+']' ;
        
       
    
    System.out.println(str1);
    
    }
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		balanceBracket(str);
	}
}
