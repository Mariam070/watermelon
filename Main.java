import java.util.Scanner;
public class Main
{
    public static String main(double args)
    {
        int w;
        Scanner input = new Scanner(System.in);
        w=input.nextInt();
        if(w>=1 && w<=100)
        {
            if((w%2)==0 && w!=2)
                return "YES";
            else
                return "NO";
        }
        else
            return "NO";
    }
}