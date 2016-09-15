import java.util.Scanner;

/**  solevd 
 * Created by Yasha on 15-09-2016.
 */
public class TTENIS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++)
        {
          int win =0 , lose =0;
            String str = in.next();
            int l= str.length();
            for (int j = 0; j <l ; j++) {
                if(str.charAt(j)=='1')
                    win += 1;
                else
                    lose += 1;
            }

            if(win >= lose)
                System.out.println("WIN");
            else
                System.out.println("LOSE");

        }
    }
}
