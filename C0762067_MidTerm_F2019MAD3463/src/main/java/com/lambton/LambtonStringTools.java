package com.lambton;

public class LambtonStringTools {
    public void reverse(String s)
    {
        String b = "";
        String a=s;
        for (int i = a.length()-1; i >= 0; i--)
        {
            b= b + a.charAt(i);
        }
        System.out.println("Reverse of String  :"+b);

    }
    public  void binaryToDecimal(String s)
    {
        int a = Integer.parseInt(s,2);
        System.out.println(s+" is equal to " +a);
    }
    public void initials(String s) {
        String b = "";
        String a = s;
        String[] ab=a.split(" ");
        char c = ' ';
        if(ab.length==3)
        {
            for (int i=0; i<ab.length-1; i++) {
                c = ab[i].charAt(0);
                b += c+".";
            }
            System.out.println(b);
        }
        else {
            System.out.println("null");
        }

    }

}

