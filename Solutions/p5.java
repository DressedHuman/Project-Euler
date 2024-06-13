public class p5 {
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
