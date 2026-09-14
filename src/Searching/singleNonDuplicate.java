package Searching;

public class singleNonDuplicate {

    static int getsingleNonDuplicate(int[] nums){
        //finding one non duplicate in the array of pair of duplicate elements

        int s = 0;

        int n = nums.length;
        int e = n-1;

        while(s<=e){
            int mid = s +(e-s)/2;
          //if there is single element
            if(s==e){
                return nums[s];
            }

            int currValue = nums[mid];

            int prevValue = -1;
            if(mid-1 >=0){
                prevValue = nums[mid-1];
            }
            int nextValue = -1;
            if(mid+1 < n){
                nextValue = nums[mid+1];
            }
            if(currValue != prevValue && currValue != nextValue){
                return currValue;
            }
            else if (currValue!= nextValue && currValue == prevValue) {
                int endingIndex = mid;

                if((endingIndex & 1) == 1){
                    // it means endingIndex is odd
                    //move to right

                    s = mid +1;
                }else{
                    e = mid-1;
                }

            }
            else if (currValue != prevValue && currValue == nextValue){

                int startingIndex = mid;

                if((startingIndex & 1)== 1){
                    e= mid -1;
                }
                else{
                    s = mid+1;
                }

            }
        }
        return  -1;
    }

    public static  void main(String[] args){
        int[] nums = {10,10,20,20,30,30,40,40,50,60,60};

        System.out.println(getsingleNonDuplicate(nums));
    }
}
