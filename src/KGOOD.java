/**
 * Created by Yasha on 28-05-2016.
 */
import java.util.*;
public class KGOOD {

    public static void main(String[] args)
    {
        boolean f=false;  int c=0;
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t ; i++)
        {
           String s= in.next();
            int k= in.nextInt();
            int l= s.length();
            char a[] = new char[l];
            char b[] = new char[l];




            for (int j = 0; j < l; j++)
                a[j]=s.charAt(j);





              c=0;
            for (int j = 0; j <l; j++)
            {    f= false;
                for (int m = 0; m < j; m++)
                {

                    if(a[j] == a[m])
                    {f= true;   break;}
                }

                if(true)
                    continue;
                else
                {
                    b[c]=a[j]; c++;}
            }







            int fq[]= new int[l];  int g=-1,sm=100000000;

            for (int j = 0; b[j] != '\u0000'  ; j++)
            {   c=0;
                for (int m = 0; m <l ; m++)
                    if(b[j]==a[m])
                        c+=1;

                fq[j] = c;
                if(c>g)
                    g=c;
                if(sm<c)
                    sm=c;
            }








            int x= g-sm, count =0;

            for (int j = 0; fq[j] != 0 ; j++)
            {
                if(k - (fq[j])<0 )
                    count+=1;
            }
            System.out.println(count);

        }

    }

}
