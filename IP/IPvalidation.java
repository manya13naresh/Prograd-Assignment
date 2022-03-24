import java.util.Scanner;

public class IPvalidation {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	System.out.println(validate( str1));
	}

@SuppressWarnings("unused")
public static Boolean validate(String str) 
{
	String[] arrOfStr = str.split("\\.");
	if(arrOfStr.length != 4)
		return false;	
	int n=(int) Integer.parseInt(arrOfStr[arrOfStr.length-1]);
	if(n==0 || n==255)
		return false;
	for(int i = 0; i< arrOfStr.length;i++ ) {
			int c = Integer.parseInt(arrOfStr[i]);
			if(c<0 || c>255) 
				return false;
		
			else return true;
		}
	return true;
	}
}
