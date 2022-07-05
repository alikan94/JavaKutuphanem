package edabit_ExpertChallanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RecursionFibonacciString {

    /*
    A Fibonacci string is a precedence of the Fibonacci series.
    It works with any two characters of the English
    alphabet (as opposed to the numbers 0 and 1 in the Fibonacci series) as its initial items
    and concatenates them together as it progresses similarly to that of the Fibonacci series.
        Examples
        generate(3, ["j", "h"]) ➞ "j, h, hj"
        generate(5, ["e", "a"]) ➞ "e, a, ae, aea, aeaae"
        generate(6, ["n", "k"]) ➞ "n, k, kn, knk, knkkn, knkknknk"

        generate(1, ["f", "g"]) ➞ "invalid"
        // return "invalid" if n is less than 2
    Notes
        You are expected to solve this challenge via recursion.
        You can check on the Resources tab for more details about recursion in Java.
        An iterative version of this challenge can be found via this link.
        A collection of challenges in recursion can found via this link.
     */

    static List<String> sonucList=new ArrayList<>();

    public static String generate(int n, String[] s) {
        // recursive code here

        String s0 = s[0];
        String s1 = s[1];
        String temp = s1 + s0;

        if (!sonucList.contains(s[0])){
            sonucList.add(s[0]);
        }
        if (!sonucList.contains(s[1])){
            sonucList.add(s[1]);
        }
        if (sonucList.size()==n){
            List<String> tempSonucList = new ArrayList<>(sonucList);
            sonucList.removeAll(tempSonucList);
            String sonuc ="";
            ListIterator<String> itr = tempSonucList.listIterator();
            for (String each: tempSonucList
                 ) {
                if (itr.hasNext()){
                    String temp2 = each;

                    itr.next();
                    if (itr.hasNext()){
                        sonuc += temp2 + ", ";
                    } else {
                        sonuc += temp2;
                    }
                }
            }
            return sonuc;
        }

        s[0] = s1;
        s[1] = temp;

        if (n<2){
            return "invalid";
        }
        return generate(n,s);
    }

    public static void main(String[] args) {
        System.out.println(generate(5, new String[]{"e", "a"}));
        System.out.println(generate(6, new String[]{"n", "k"}));
        System.out.println(generate(9, new String[] {"b", "a"}));
        System.out.println(generate(11, new String[]{"z", "x"}));
        System.out.println(generate(12, new String[]{"t", "d"}));
        System.out.println(generate(4, new String[]{"x", "t"}));
        System.out.println(generate(3, new String[]{"j", "h"}));
        System.out.println("===========----------============");

        System.out.println(generate2(5, new String[]{"e", "a"}));
        System.out.println(generate2(6, new String[]{"n", "k"}));

        System.out.println("===========----------============");

        System.out.println(generate3(9, new String[] {"b", "a"}));
        System.out.println(generate3(11, new String[]{"z", "x"}));
        System.out.println(generate3(12, new String[]{"t", "d"}));

        System.out.println("===========----------============");

        System.out.println(generate4(4, new String[]{"x", "t"}));
        System.out.println(generate4(3, new String[]{"j", "h"}));
    }

    // other solutions

    public static String generate2(int n, String[] s) {
        if(n==1&&s[0].length()==1) return "invalid";
        String []x=new String[2];
        x[0]=s[1]+s[0];
        x[1]=x[0]+s[1];
        if(n==2) return s[0]+", "+s[1];
        if(n==1) return s[0];
        return s[0]+", "+s[1]+", "+generate2(n-2, x);
    }

    public static String generate3(int n, String[] s) {
        if(n < 2 || s.length == n) return n < 2 ? "invalid" : String.join(", ", s);
        ArrayList<String> t = new ArrayList<>(Arrays.asList(s));
        t.add(s[s.length-1] + s[s.length-2]);
        return generate3(n, t.stream().toArray(String[]::new));
    }

    public static String generate4(int n, String[] s) {
        if (n<3) return n<2 ? "invalid" : String.join(", ", java.util.Arrays.asList(s));
        int l=s.length;
        String[] a=new String[l+1];
        System.arraycopy(s, 0, a, 0, l);
        a[l]=a[l-1]+a[l-2];
        return generate4(--n, a);
    }
}
