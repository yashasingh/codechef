/**
 * Created by Yasha on 10-02-2016.
 */
import java.util.*;
import java.lang.*;
public class CHEFDETE {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int ar[]= new int[n];int x;

        for (int i = 0; i <n ; i++)
        {
         x = in.nextInt();
            if(x==0)
                continue;
            ar[i]= ar[i]-1;
            ar[x]=ar[x]+1;

        }
         int j =0;
        int min= ar[j];
        for (; j <n ; j++) {
            if(ar[j]<min)
                min = ar[j];
        }
        for (int k = 0; k <n ; k++) {
            if(ar[k]==min )
                System.out.print((k+1)+" ");

        }

    }



}
