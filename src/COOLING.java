/** done
 * Created by Yasha on 12-02-2016.
 */
import java.util.*;

public class COOLING {




    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t= in.nextInt();


        for (int i = 0; i <t ; i++)
        {
            int n= in.nextInt();
            int a1[]= new int[n];
            int a2[]= new int[n];

            for (int j = 0; j <n ; j++)
               a1[j]= in.nextInt();
            for (int j = 0; j <n ; j++)
                a2[j]= in.nextInt();




            int pos=0,min=0;
        for (int k = 0; k <n ; k++)
        {   min= a2[k]; pos=k;
            for (int z = k+1; z <n ; z++)
            {
                if(a2[z]<min)
                { min = a2[z];
                   pos =z;}
            }
            int temp = a2[k];
            a2[k]=a2[pos];
            a2[pos]=temp;

        }


          int cnt =0;

            for (int p = 0; p <n ; p++)
            {
                for (int q = 0; q <n ; q++)
                {
                    if(a2[q]!= -1)
                    if(a1[p]<=a2[q])
                    {cnt+=1;a2[q]=-1;break;}

                }
            }

            System.out.println(cnt);


        }


    }
}
