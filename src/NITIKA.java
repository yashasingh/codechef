import java.util.Scanner;

public class NITIKA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String w = in.nextLine();
        while(t>0)
        {
            String s = in.nextLine();
            String st ="",str ="";
            if(s.indexOf(' ') != -1)
            { s = s.toUpperCase();
            s = s.trim();
            for (int i = 0; i <s.length() ; i++) {
                  char ch = s.charAt(i);
                  if(ch != ' ')
                   st =  st + "" + ch;
                  else
                  {
                       str = str+ st.charAt(0)+". ";
                       st = "";
                  }
            }
            int index = s.lastIndexOf(' ');
            char ts = s.charAt(index+1);
            String temp =  s.substring(index+2);
            temp = temp.toLowerCase();
            str = str+ts+""+temp; }
            else
            {
                s= s.trim();
                s = s.toLowerCase();
                char ch = Character.toUpperCase(s.charAt(0));
                String sub = s.substring(1);
                str = ch+sub;
            }
            System.out.println(str);
            t--;
        }
    }
}
