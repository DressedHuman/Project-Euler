public class p10 {
    public static long sum(int[] primes){
        long sum = 0;
        int i = 0;
        while(i<primes.length && primes[i]>0){
            sum += primes[i];
            ++i;
        }

        return sum;
    }

    public static int[] sievePrime(int n){
        int[] primes = new int[n/2];
        int[] mark = new int[n];
        int nPrime = 0;
        int i, j, limit = (int) Math.sqrt(n+1);
        
        mark[1] = 1;
        // for(int i=2; i<mark.length; i += 2) mark[i] = 1;

        primes[nPrime++] = 2;
        for(i=3; i<n; i+=2){
            if(mark[i] != 1){
                primes[nPrime++] = i;
                if(i<=limit){
                    for(j=i*i; j<n; j += i*2){
                        mark[j] = 1;
                    }
                }
            }
        }
        
        return primes;
    }

    public static void main(String[] args){
        int n = 2_000_000;
        int[] primes = sievePrime(n);
        int i;

        long total = sum(primes);
        System.out.println(total);
    }
}
