/**
 * Created by Yasha on 06-02-2016.
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class HS08TEST
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);


        int x= in.nextInt();
        double y =in.nextDouble();

        if(!(x>=0 && x<=2000 && y>=0.00 && y<=2000.00))
            return;

        if(x%5 != 0  ||  x>y)
        {
           BigDecimal bd= new BigDecimal(y);
            bd = bd.setScale(2);
            System.out.println(bd);

        }
       else
        {
            double amt= y-x-0.50;
            BigDecimal bd= new BigDecimal(amt);
            bd = bd.setScale(2);
            System.out.println(bd);

        }











    }
}
