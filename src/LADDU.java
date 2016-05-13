/**
 * Created by Yasha on 12-05-2016.
 */
import java.util.*;
import java.lang.*;
public class LADDU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i <t ; i++)
        {    int ladu = 0;
           int n = in.nextInt();
            String str = in.next();

            for (int j = 0; j <n; j++)
            {
                String s = in.next();
                if(s.equals("CONTEST_WON"))
                {   ladu += 300;
                    int r = in.nextInt();
                    if(r<20)
                        ladu += (20-r);
                }
                if(s.equals("TOP_CONTRIBUTOR"))
                    ladu += 300;

                if(s.equals("BUG_FOUND"))
                    ladu += in.nextInt();

                if(s.equals("CONTEST_HOSTED"))
                    ladu += 50;
            }

            if(str.equals("INDIAN"))
                System.out.println((ladu / 200));
            else
                System.out.println((ladu/400));
            //System.out.println(str);


        }
    }
}
