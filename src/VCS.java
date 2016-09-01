import java.util.Scanner;

/**
 * Created by Yasha on 31-08-2016.
 */
public class VCS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int ar[] = new  int[n+1];
            for (int j = 0; j <m; j++) {
                int c= in.nextInt();
                ar[c]++;
            }
            for (int j = 0; j <k; j++) {
                int c= in.nextInt();
                ar[c]++;
            }
            int c1=0,c2=0;
            for (int j = 1; j <=n ; j++) {
                if(ar[j]==0)
                    c1 += 1;
                if (ar[j]==2)
                    c2 += 1;
            }
            System.out.println(c2+" "+c1);
        }
    }
}
