import java.util.*;

public class Day7pb1 {

    public int[] reverseN(int[] num)
    {
        int[] reversedArray = new int[num.length];
        int j = 0;
        for (int i = num.length -1; i >= 0; i--)
                reversedArray[j++] = num[i];
        return reversedArray;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        
        Day7pb1 ob=new Day7pb1();
        a=ob.reverseN(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
    
}
