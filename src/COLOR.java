import java.util.Scanner;

/**
 * Created by yasha on 25/6/17.
 */
public class COLOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t>0)
        {
            int l = in.nextInt();
            String s = in.next();
            int cr =0, cg=0, cb=0;
            for (int i = 0; i <l ; i++) {
                if(s.charAt(i) == 'R')
                    cr++;
                else if(s.charAt(i) == 'G')
                    cg++;
                else
                    cb++;
            }
            int max = Math.max(cr, Math.max(cg,cb));
            max = l-max;
            System.out.println(max);
            t--;
        }
    }
}
