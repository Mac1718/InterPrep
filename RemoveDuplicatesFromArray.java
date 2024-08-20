public class RemoveDuplicatesFromArray 
{
    public static void main(String[] args) 
    {
        int [] a={2,2,3,3,5,6,7,7};
        int size=a.length;
        int[] b = new int[size];
        int j=0;
        
        for(int i=0;i<size-1;i++)
            {
               if(a[i]!=a[i+1])
               {
                b[j++]=a[i];
               }
            }
            for(int k=0;k<size;k++)
            {
                System.out.println(b[k]);
            }
    }    
}
