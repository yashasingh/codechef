/**
 * Created by Yasha on 07-02-2016.
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SPCANDY
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t;i++)
        {
            int n= in.nextInt();
            int k = in.nextInt();

            int j = n%k;
            int tcandy= n-j;
            int each= n/k;

            System.out.println(each +"  "+j);


        }


        // your code goes here
    }
}

