public class p3{
    public static boolean isPrime(Long num){
        for(int i=2; i<=(int) Math.pow(num, .5)+1; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        long dividend =  600851475143L;
        long primeFactor = -1;

        for(long i=3; i<=(dividend/3); ++i){
            if(dividend%i==0 && isPrime(dividend/i)){
                primeFactor = dividend/i;
                break;
            }
        }

        System.out.println(primeFactor);
    }
}