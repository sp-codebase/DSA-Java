package BasicMaths;

public class PerfectNumber {
    static boolean getPerfect(int nums) {
        int Number = nums;
        int sum = 0;
        for (int i = 1; i < nums; i++) {
            if (nums % i == 0) {
                // i divide perfectly
                // now pair factor
                // 1st factor -> i
                //2nd factor -> num/i
            sum = sum + i;

            }

        }
        if (Number == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        int nums = 6;
        System.out.println(getPerfect(nums));
    }
}
