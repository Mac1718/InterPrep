import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArrays 
{
    public static void main(String[] args) 
    {
        int[] a={1,4,3,2,5};
        int [] b={1,7,6,8};

        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        for(int j=0;j<b.length;j++)
        {
            if(set.contains(b[j]))
            {
                ans.add(b[j]);
                set.remove(b[j]);
            }
        }

        System.out.println(ans);
    }    
}
