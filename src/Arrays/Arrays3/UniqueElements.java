package Arrays.Arrays3;

public class UniqueElements {
    static int uniqueElements(int[] nums){

        int XorSum = 0;
        for (int x:nums){
            XorSum = XorSum^x;
        }
        return XorSum;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,2,2,3,3,4,4,5,5};

        System.out.println(uniqueElements(nums));
    }
}
