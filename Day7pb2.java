
public class Day7pb2 {

    int sum(int[] n)
    {
        int s=0;
        for(int i=0;i<n.length;i++)
            s=s+n[i];
        return s;
    }
    public static void main(String[] args) {
        Day7pb2 ob=new Day7pb2();
        int a[]={1,2,3,4,5};
        int s1=ob.sum(a);
        System.out.println(s1);
    }
    
    
}
