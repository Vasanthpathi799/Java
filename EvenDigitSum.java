public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }
        else{
            int t=number,r,s=0;
            while(t>0){
                r=t%10;
                if (r%2==0){
                    s+=r;
                }
                t=t/10;
            }
            return s;
        }   
    }
    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(122));
    }
}