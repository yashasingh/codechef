import java.util.Scanner;


public class CHEFSIGN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while (t>0)
        {
            String str = in.next();
            long curr =0L, max = 0L, min =0L;
            for (int i = 0; i <str.length() ; i++) {
                char ch = str.charAt((i));
                if(ch == '<')  curr++;
                if(ch == '>')  curr--;
                if(curr > max)
                    max = curr;
                if(curr < min)
                    min = curr;
            }

            long ans = max+Math.abs(min)+1;
            System.out.println(ans);


            t--;
        }
    }
}
