/**
 * Created by Yasha on 28-05-2016.
 * 
 * The problem was --- 
 * Chef Al Gorithm was reading a book about climate and oceans when he encountered the word “glaciological”. He thought it was quite curious, because it has the following interesting property: For every two letters in the word, if the first appears x times and the second appears y times, then |x - y| ≤ 1.
Chef Al was happy about this and called such words 1-good words. He also generalized the concept: He said a word was K-good if for every two letters in the word, if the first appears x times and the second appears y times, then |x - y| ≤ K.
Now, the Chef likes K-good words a lot and so was wondering: Given some word w, how many letters does he have to remove to make it K-good?
Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case consists of a single line containing two things: a word w and an integer K, separated by a space.
Output

For each test case, output a single line containing a single integer: the minimum number of letters he has to remove to make the word K-good.
Constraints

1 ≤ T ≤ 30
1 ≤ |w| ≤ 105
0 ≤ K ≤ 105
w contains only lowercase English letters.
Example

Input:
4
glaciological 1
teammate 0
possessions 3
defenselessness 3

Output:
0
0
1
2
Explanation

Example case 1. The word “glaciological” is already 1-good, so the Chef doesn't have to remove any letter.
Example case 2. Similarly, “teammate” is already 0-good.
Example case 3. The word “possessions” is 4-good. To make it 3-good, the Chef can remove the last s to make “possession”.
Example case 4. The word “defenselessness” is 4-good. To make it 3-good, Chef Al can remove an s and an e to make, for example, “defenslesness”. Note that the word doesn't have to be a valid English word.
 
 
 */
import java.util.*;
public class KGOOD {

    public static void main(String[] args)
    {
        boolean f=false;  int c=0;
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t ; i++)
        {
           String s= in.next();
            int k= in.nextInt();
            int l= s.length();
            char a[] = new char[l];
            char b[] = new char[l];




            for (int j = 0; j < l; j++)
                a[j]=s.charAt(j);





              c=0;
            for (int j = 0; j <l; j++)
            {    f= false;
                for (int m = 0; m < j; m++)
                {

                    if(a[j] == a[m])
                    {f= true;   break;}
                }

                if(true)
                    continue;
                else
                {
                    b[c]=a[j]; c++;}
            }







            int fq[]= new int[l];  int g=-1,sm=100000000;

            for (int j = 0; b[j] != '\u0000'  ; j++)
            {   c=0;
                for (int m = 0; m <l ; m++)
                    if(b[j]==a[m])
                        c+=1;

                fq[j] = c;
                if(c>g)
                    g=c;
                if(sm<c)
                    sm=c;
            }








            int x= g-sm, count =0;

            for (int j = 0; fq[j] != 0 ; j++)
            {
                if(k - (fq[j])<0 )
                    count+=1;
            }
            System.out.println(count);

        }

    }

}
