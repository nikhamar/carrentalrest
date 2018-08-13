package com;

public class Typesmath {

    public static void main(String[] args)
    {
        String s1= "Nikhil";
        String s2="Amaraneni";

        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.codePointAt(3));
        System.out.println(s1.codePointBefore(2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.contains("r"));
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.endsWith("l"));
        System.out.println(s1.hashCode());
        System.out.println(s1.isEmpty());



    }
}
class  math
{
    public static void main(String[] args)
    {

        double a=12;
        double b=27.9;
        int c=1;
        double d=0.5;
        double e=1;
        System.out.println(Math.abs(a));
        System.out.println(Math.acos(c));
        System.out.println(Math.asin(d));
        System.out.println(Math.cbrt(b));
        System.out.println(Math.ceil(b));
        System.out.println(Math.copySign(a,b));
        System.out.println(Math.floor(b));
        System.out.println(Math.expm1(e));
        System.out.println(Math.getExponent(a));

    }

}