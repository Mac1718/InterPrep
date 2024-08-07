public class Occurrance 
{
    public static void main(String[] args) 
    {
        String s="Mahant is an Intelligent Boy";
        int totalcount=s.length();
        int originalcount=s.replace("a","").length();
        int count =totalcount-originalcount;

        System.out.println(count);
    }    
}
