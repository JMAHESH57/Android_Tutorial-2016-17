
public class Day7pb6 {

    boolean pair(int[] n,int p)
    {   //int d[]={3,1,4};int j=0;
        for(int i=0;i<(n.length)-1;i++)
        {
            if(n[i]==p||n[i+1]==p)
            {
                continue;               
            }
            else
            {
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
    
        Day7pb6 ob=new Day7pb6();
        
        int a[]={1, 2, 1, 3};
        boolean is=ob.pair(a,1);
        System.out.println(is);
    }
    
}
