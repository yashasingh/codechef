/**
 * Created by Yasha on 29-05-2016.
 */
import java.util.*;
public class mmsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int h = 0; h < t; h++)
        {
            int n= in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
                arr[j]=in.nextInt();


            int sum=0,g=-999999999,begin=-1, end=-1,small=999999999,temp=0;

            for (int i = 0; i <n-1 ; i++) {
                for (int j = i+1; j <n ; j++) {
                    sum=0;
                    for (int k = i; k <=j; k++)
                    {
                        sum += arr[k];
                        if(sum>g)
                        {g=sum;
                          begin=i; end=j;
                        }

                    }
                }
            }
            //System.out.println(begin +"   "+ end);

            for (int i = begin; i <=end; i++) {
                temp += arr[i];
                if(arr[i]<small)
                    small=arr[i];
            }
            //System.out.println(small);
            if(small<0)
                temp= temp-small;

            System.out.println(temp);

        }

    }
}
