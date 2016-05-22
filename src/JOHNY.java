/**
 * Created by Yasha on 21-03-2016.
 */
import java.util.*;
public class JOHNY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        for (int i = 0; i <t ; i++)
        {
             int n = in.nextInt();
            int ar[]= new int[n];
            for (int j = 0; j <n ; j++)
             ar[j]= in.nextInt();
            int pos = in.nextInt();
              int jon = ar[pos-1];

            int small =ar[0], ps = 0;
            for (int p = 0; p < n; p++)
            {    small =ar[p]; ps=p;
                for (int q = p+1; q < n; q++)
                {
                   if(ar[q]<small)
                   {small = ar[q];
                   ps =q;}
                }
                int temp = ar[p];
                ar[p]= ar[ps];
                ar[ps]= temp;
            }

            for (int j = 0; j <n ; j++)
            {
               if(ar[j]== jon)
                   System.out.println(j+1);
            }


        }







    }


}
