/**
 * Created by Yasha on 07-02-2016.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HOLES {
    public static void main(String[] args) throws java.lang.Exception {
        // youSr code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int h = 0;
        char c;
        String s = "";

        for (int i = 0; i < t; i++) {
            s = in.next();

            for (int j = 0; j < s.length(); j++) {
                c = s.charAt(j);
                if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q' || c == 'R')
                    h += 1;
                if (c == 'B')
                    h += 2;
            }

            System.out.println(h);
            h = 0;

        }
    }
}


