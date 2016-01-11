import java.util.Scanner;

/**
 * Created by Yasha on 20-12-2015.
 */


public class FLOW016 {


    static int computeGCD(int num1, int num2){
        int a=0;
        int b=0;
        int c=0;
        if(num1>num2)
        {a=num1;
            b=num2;}
        else
        {a=num2;
            b=num1;}
        while(a%b !=0) {
            c = b;
            b = a%b;
            a = c;
        }

        return b;
    }

    static int computeLCM(int num1, int num2) {
        int a = 0;
        int b = 0;
        int c = 0;
        if (num1 > num2) {
            a = num1;
            b = num2;
        } else {
            a = num2;
            b = num1;
        }

        c =3; int d=0;
        if (a % b == 0)
            return a;
        else {
             d=b*2;
            while (d%a != 0) {
                d = b*c;
                c++;
            }
            return d;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_cases =  in.nextInt();
        System.out.println(num_cases);
        for(int i=0 ; i < num_cases; i++){
            int num1 = in.nextInt();
            int num2 = in.nextInt();



            int gcd = computeGCD(num1, num2);
            int lcm = computeLCM(num1, num2);
            System.out.println(gcd + " " + lcm);
        }
    }

}
