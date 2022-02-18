public class PrimitiveAndObject {
    public static boolean isPalindrome(int number){
        int t=number,r,rev=0;
        if (number<0)
        {    t=-number;
        }
        while (t>0){
            r=t%10;
            rev=rev*10+r;
            t=t/10;
            
        }
        if (number<0){
            if (rev==-number)
            {   return true;}
            else{
                return false;
            }
        }
       else{
           if (rev==number)
           {
               return true;
           }
           else
           {   return false;}
       }
       
    }

    public static void main(String[] args) {
        PrimitiveAndObject po=new PrimitiveAndObject();
        System.out.println(po.isPalindrome(1401));
    }
}