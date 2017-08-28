import java.util.Scanner;

/**
 * Created by yasha on 25/6/17.
 */
public class ADACRA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t>0)
        {
            String s = in.next();
            int l = s.length(); int flag, flip=0 ;
            if(s.charAt(0)== 'U')
              flag = 1;
            else
               flag =0;

            for (int i=1; i<l; i++)
            {
                if(s.charAt(i) == 'U' && flag == 0)
                {
                    flag = 1;
                    flip++;
                }

                if(s.charAt(i) == 'D' && flag == 1)
                {
                    flag = 0;
                    flip++;
                }
            }
            if(s.charAt(0) == s.charAt(l-1))
                flip = flip/2;
            else
                flip = (flip+1)/2;

            System.out.println(flip);
            t--;
        }
    }
}
