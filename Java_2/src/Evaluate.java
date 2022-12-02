import java.util.*;
import java.lang.*;

public class Evaluate {
    public static String findParam(String str){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                System.out.println("Input vyrazhenie = ");
                String param = sc.next();
                str = str.replaceAll(String.valueOf(str.charAt(i)),param);
            }
        }
        return str;
    }

    public static boolean isError(String s){
        int skob1=0,skob2=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') skob1++;
            if (s.charAt(i) == ')') skob2++;
        }
        return !(skob1==skob2);
    }

    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner sc = new Scanner(System.in);
        String str = "(((3+a)/(1*b))+2)";
        str = findParam(str);
        if (!isError(str)) {
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if (s.equals("(")) ;
                else if (s.equals("+"))
                    ops.push(s);
                else if (s.equals("-"))
                    ops.push(s);
                else if (s.equals("*"))
                    ops.push(s);
                else if (s.equals("/"))
                    ops.push(s);
                else if (s.equals("sqrt"))
                    ops.push(s);
                else if (s.equals(")")) {
                    String op = ops.pop();
                    double v = vals.pop();
                    if (op.equals("+")) v = vals.pop() + v;
                    else if (op.equals("-")) v = vals.pop() - v;
                    else if (op.equals("*")) v = vals.pop() * v;
                    else if (op.equals("/")) v = vals.pop() / v;
                    else if (op.equals("sqrt")) v = Math.sqrt(v);
                    vals.push(v);
                } else vals.push(Double.parseDouble(s));
            }
            System.out.println(vals.pop());
        }
        else System.out.println("Error in the vyrazhenii!");
    }
}