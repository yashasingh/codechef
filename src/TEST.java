import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);


        while(in.hasNextInt())
        {
            int a=in.nextInt();
            if(a == 42)
                break;
            else
            {
                if(a>=-9 && a<100)
                    System.out.println(a);
                else
                    continue;
            }
        }






    }
}
