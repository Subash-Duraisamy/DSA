import java.util.*;
class swap
{
    public static void main(String args[])
    {
        int a=12;
        int b=14;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

        // without temp
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}