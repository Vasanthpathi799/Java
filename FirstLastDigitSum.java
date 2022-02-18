public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        else{
            int t=number,first=0,last;
           while(t>0){
               first=t;
               t=t/10;
           }
           last=number%10;
         
            return (first+last);
        }
    }
    public static void main(String[] args) {
        FirstLastDigitSum fl=new FirstLastDigitSum();
        System.out.println(sumFirstAndLastDigit(122));
    }
}