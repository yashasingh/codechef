import java.util.Scanner;

/**
 * Created by Yasha on 07-01-2017.
 */
public class CATSDOGS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i <t ; i++) {
            int c = in.nextInt();
            int d = in.nextInt();
            int l = in.nextInt();

            int y = (c+d)*4;
            if(l%4 != 0 || l > y || d> (l/4) || (c-(2*d))+d > l/4 )
                System.out.println("no");
            else
                System.out.println("yes");

          //  int m = d*4;int f=0;

           /* if(c > 2*d)
            { f= (c-(2*d))*4; m+=f;}
            if(l >= d*4 && l%4 ==0)
                System.out.println("yes");  */







        }
    }
}
