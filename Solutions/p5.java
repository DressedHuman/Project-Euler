/* public class p5 {
    public static long gcd(long num1, long num2){
        if(num1%num2==0){
            return num2;
        }
        return gcd(num2, num1%num2);
    }

    public static long lcm(long num1, long num2){
        return (num1*num2)/gcd(num1, num2);
    }

    public static long LCM(int[] nums){
        long current_lcm = nums[0];
        for(int i=1; i<nums.length; ++i){
            current_lcm = lcm(current_lcm, nums[i]);
        }

        return current_lcm;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        long lcm_of_nums = LCM(arr);
        System.out.println(lcm_of_nums);
    }
}
 */

import java.util.Scanner;

public class p5 {
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); ++i){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int current_prime){
        current_prime += 2;
        while(!isPrime(current_prime)){
            current_prime += 2;
        }
        return current_prime;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // assume that we already found the first prime, 2
        System.out.printf("Type in the last digit: ");
        int last_digit = scanner.nextInt(); // 20
        long lcm = (long) Math.pow(2, (int) (Math.log(last_digit)/Math.log(2)));
        int current_prime = 3;

        while(current_prime<=last_digit){
            lcm *= (long) Math.pow(current_prime, (int) (Math.log(last_digit)/Math.log(current_prime)));
            current_prime = nextPrime(current_prime);
        }
        
        System.out.println(lcm);
        
    }
 }