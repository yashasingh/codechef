import java.util.Scanner;

/**
 * Created by yasha on 26/8/17.
 */
public class MATPAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t>0){
            int a[] = new int[26];
            int b[] = new int[26];
            int price=0;
            for (int i = 0; i <26 ; i++) {
               a[i]=in.nextInt();
            }
            String str = in.next();
            int l = str.length();
            for (int i = 0; i<l ; i++) {
                char ch = str.charAt(i);
                int f = ch-97;
                b[f]++;
            }
            for (int i = 0; i <26 ; i++) {
                if(b[i]==0)
                    price += a[i];
            }
            System.out.println(price);
            t--;
        }
    }
}
