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
        String signs = "";
        String a = s;
        String[] WhiteSpace=a.split(" ");
        char connect = ' ';
        if(WhiteSpace.length==3)
        {
            for (int i=0; i<WhiteSpace.length-1; i++) {
                connect = WhiteSpace[i].charAt(0);
                signs += connect+".";
            }
            signs+=WhiteSpace[WhiteSpace.length-1];
            System.out.println(signs);
        }
        else {
            System.out.println("null");
        }

    }

}

