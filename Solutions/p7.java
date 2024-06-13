public class p7 {
    public static boolean isPrime(Integer num){
        for(int i=2; i<(Math.sqrt(num)+1); ++i){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(Integer currentPrime){
        currentPrime += 2;
        while(!isPrime(currentPrime)){
            currentPrime += 2;
        }
        return currentPrime;
    }

    public static void main(String[] args){
        int count = 2; // assume we found 2, 3 as the first 2 primes; so current prime is 3;
        int currentPrime = 3;

        while(count<10001){
            currentPrime = nextPrime(currentPrime);
            ++count;
        }

        System.out.println(currentPrime);
    }
}
