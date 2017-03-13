import java.util.Scanner;


public class EXTRAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = in.nextInt();
            int a[] = new int[n];
            int tsum =0, sum=0;
            int small = 999999999,big=0;
            for (int j = 0; j <n ; j++) {
              a[j] = in.nextInt();
                tsum += a[j];
               if(a[j] < small)
                   small = a[j];
               if(a[j]>big)
                   big = a[j];
            }
            int nexts= 999999999, nextb=0;
            for (int j = 0; j <n ; j++) {
                if(a[j]< nexts && a[j] != small)
                      nexts =a[j];
                if(a[j]>nextb && a[j] != big)
                      nextb = a[j];
            }
            if(nexts-small >1)
                System.out.println(small);
            else if(big-nextb >1)
                System.out.println(big);
            else {
                for (int j = 0; j <n-1 ; j++) {
                    sum = sum + (small+j);
                }
                System.out.println(tsum-sum);

            }

        }
    }
}
