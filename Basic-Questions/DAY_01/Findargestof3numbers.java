import java.util.Arrays;

public class Findargestof3numbers {
    public static void main(String args[])
    {
      int a[]={10,4,88};
      if(a[0]>=a[1] && a[0]>=a[2])
      {
        System.out.println(a[0]+" is largest");
      }
      else if(a[1]>=a[0] && a[1]>=a[2])
      {
        System.out.println(a[1]+" is largest");
      }
      else
      {
        System.out.println(a[2]+" is largest");
      }
      Arrays.sort(a);
      System.out.println(a[a.length-1]);
    }
    // by using 
    
}
