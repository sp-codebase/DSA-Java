package Arrays.Arrays3;

public class SortArray {

    static int[] getSortArray(int [] nums) {
         int n = nums.length;
         int i = 0;
         int j = n-1;

//sort 0's nd 1's
         while(i<j){
             if(nums[i] == 0){

                 i++;

             }

             else if(nums[j] == 1){

                  j--;
             }

             else
             {
                 //swap
                 int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
                 i++;
                 j--;
             }

         }

         return nums;

    }

    static int[] SortArray1(int [] nums) {
        int n = nums.length-1;//high
        int i = 0;//low
        int j = 0;//mid
        while (j<=n){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 1){
                j++;
            }

            else{
                int temp = nums[j];
                nums[j] = nums[n];
                nums[n] = temp;
                n--;
            }


        }
        return nums;
    }


    public static void main(String[] args) {
//        int [] nums = {0,1,0,1,0,1};
//
//       nums =  getSortArray(nums);
//        for (int x:nums){
//            System.out.print(x +" ");
//        }


      int [] nums = {2,0,2,1,1,0};

        nums = SortArray1(nums);

        for(int x : nums){
            System.out.print(x+" ");
        }
    }


}
