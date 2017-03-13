import java.util.Scanner;

/**
 * Created by Yasha on 13-03-2017.
 */
public class XENTASK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t ; i++) {
            int xeven =0, xodd =0 , yeven =0, yodd =0, n = in.nextInt();
            for (int j = 0; j <n ; j++) {
                int time = in.nextInt();
                if(j%2 == 0)
                    xeven += time;
                else
                    xodd += time;
            }
            for (int j = 0; j <n ; j++) {
                int time = in.nextInt();
                if(j%2 == 0)
                    yeven += time;
                else
                    yodd += time;
            }

            if(xeven+yodd <= yeven+xodd)
                System.out.println(xeven+yodd);
            else
                System.out.println(yeven+xodd);
        }
    }
}
