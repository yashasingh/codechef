import java.util.Scanner;


public class CHEFROUT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t>0) {
            String s = in.next();
            int l = s.length();
            int flag =0, last=0; int signal =1;
            for (int i = 0; i <l ; i++) {
                if(s.charAt(i) == 'C')
                    flag =0;
                else if(s.charAt(i) == 'E')
                    flag =1;
                else
                    flag = 2;
                if(last > flag)
                 {   signal =0; break; }
                last = flag;
            }
            if(signal == 1)
                System.out.println("yes");
            else
                System.out.println("no");
            t--;
        }
    }
}
