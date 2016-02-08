/**
 * Created by Yasha on 07-02-2016.
 */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ROWCOLOP
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int q= in.nextInt();

        int ar[][]= new int[n][n];

        for(int k=0; k<n;k++)
        {
            String str= in.next();
            String part= str.substring(0,6);
            String c= ""+str.charAt(7);
            int a= Integer.parseInt(c);
            c=""+str.charAt(9);
            int b= Integer.parseInt(c);
            if(part.equals("RowAdd"))
            {
                for(int i=0;i<n;i++)
                    ar[a-1][i] +=b;

            }
            if(part.equals("ColAdd"))
            {
                for(int i=0;i<n;i++)
                    ar[i][a-1] +=b;

            }



        }





        // your code goes here
    }
}
