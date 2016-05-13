/** solved
 * Created by Yasha on 05-03-2016.
 */
import java.util.*;
public class GDOG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i <t ; i++)
        {
            int n = in.nextInt();
            int k = in.nextInt();

            int max=0;

            for (int j = 2; j <=k; j++)
            {
                 int rem = n%j;
                 if(rem>max)
                     max = rem;


            }

            System.out.println(max);

        }


    }
}

