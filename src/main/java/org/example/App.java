package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        BaseClass b = new BaseClass("Baseclass","03/03/20","Parent Class");
        SubClass s = new SubClass(b);
        System.out.println(b.toString());
        System.out.println(s.toString());


    }
}
