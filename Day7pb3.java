
public class Day7pb3 {

   int[] lengt(int[] n)
   {
       int len=2*(n.length);
       int New[]=new int[len];
       for(int i=0;i<len;i++)
           New[i]=0;
       New[len-1]=n[n.length-1];
       return New;
   }
    public static void main(String[] args) {
        Day7pb3 ob=new Day7pb3();
        int a[]={1,2,3,5};
        int New[]=ob.lengt(a);
        for(int i=0;i<New.length;i++)
        System.out.print(New[i]);
    }
    
}
