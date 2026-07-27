package Arrays.Arrays3;

public class Missingnumber {
    static int missingNumber(int[] nums) {
        int XorSum = 0;

        //xor with all array elements
        for(int n:nums){
            XorSum = XorSum^n;
        }
        //xor with all elemnet in the range
        int n = nums.length;
        for(int i = 0; i <=n ; i++){
            XorSum = XorSum^i;
        }

        return XorSum;
    }

    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,6};
        System.out.println(missingNumber(arr));

    }

}
