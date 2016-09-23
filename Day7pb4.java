
public class Day7pb4 {

    boolean pi(int[] n)
    {   //int d[]={3,1,4};int j=0;
        for(int i=0;i<(n.length)-2;i++)
        {
            if(n[i]==3&&n[i+1]==1&&n[i+2]==4)
            {
                return true;
                
            }
            
        }
        return false;
    }
    
    public static void main(String[] args) {
    
        Day7pb4 ob=new Day7pb4();
        
        int a[]={1,2,3,1,3,1,2,4};
        boolean is=ob.pi(a);
        System.out.println(is);
    }
    
}
