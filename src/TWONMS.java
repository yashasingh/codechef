/**
 * Created by yasha on 25/6/17.
 */
import java.util.*;

class TWONMS{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while(t>0){
//            long a = in.nextLong();
//            long b = in.nextLong();
//            long n = in.nextLong();
//            long A = (n % 2 ==0) ? a : 2 * a;
//
//            int ans = (int) ((A > b) ?  A/b :  b/A);
//            System.out.println(ans);
//            t--;
//        }
        testArrayList();
    }

    static void testArrayList() {
        String[] arr = {"one","two", "three"};
        List<String> arrayList = new ArrayList(Arrays.asList(arr));
        Map numberMap = new HashMap();
        int idx =1;
        for(String i : arrayList) {
            numberMap.put(idx, i);
            idx++;
        }
        System.out.println(arrayList);
        System.out.println(numberMap);
    }
}