import java.util.*;
public class PRINCESS {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
            String str = in.next();
            int l = str.length();
            boolean flag = false;

            if(l == 2)
            {
                if(str.charAt(0) == str.charAt(1))
                {
                    flag = true;
                 //   break;
                }
            }
            else {
                if (l == 1) {
                    flag = false;
                    // break;
                } else {
                    for (int i = 2; i < l; i++) {
                        char ch1 = str.charAt(i-2);
                        char ch2 = str.charAt(i-1);
                        char ch3 = str.charAt(i);

                    if(ch1 == ch2 || ch1 == ch3){
                        flag = true;
                        break;
                      }

                    }
                }
            }
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");

            t--;
        }

    }
}