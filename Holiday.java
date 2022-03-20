import java.util.Scanner;
class holiday
{
    private String name;
    private int day;
    private String month;
    public holiday(String name,int day,String month)
    {
        this.name=name;
        this.day=day;
        this.month=month;
    }
     public boolean inSameMethod(String month1)
        {
            return (month1.equals(month));
        }
        public float avgDate(int date1)
        {
            float result;
            result=(day+date1)/2;
            return result;
        }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int date;
        String month;
        System.out.println("Enter the date");
         name=sc.next();
         date=sc.nextInt();
         month=sc.next();
         holiday obj=new holiday("Independence Day",4,"July");
         System.out.println(obj.inSameMethod(month));
         System.out.println(obj.avgDate(date));
    }
}
