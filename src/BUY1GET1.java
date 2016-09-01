/**
 * Created by Yasha on 18-02-2016.
 */
import java.util.*;
import java.lang.*;
public class BUY1GET1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        int cost=0;

        for (int i = 0; i <t ; i++)
        {
            cost=0;
            String s= in.next();
            int l= s.length();
            if(l == 1)
            {
                System.out.println(1);
                continue;
            }
            char ar[]= new char[l];
            for (int j = 0; j <l ; j++) {
             char c= s.charAt(j);
                ar[j]=c;
            }

            for (int j = 0; j <l; j++)
            {

               int cnt =0;
                char ch = ar[j];
                for (int k = j; k < l; k++)
                {
                    if(ch != '#')
                    if(ch==ar[k])
                    {  ar[k]='#';
                        cnt++;}

                }
                cost = cost+ cnt/2+ cnt%2;
            }
            System.out.println(cost);
        }



    }
}
