package Searching;

public class EKO_SPOJ {
    // in this basically have to  find the maximum height of trees st which it has to  cut down so that the
    //total woods collected >= m
    static boolean isValidAns(int[] trees, int m , int maxHeight){
        long totalWoodsCollected =0 ;

        for(int i =0; i < trees.length; i++){
            if(trees[i] > maxHeight){
                long currentWoods = trees[i] - maxHeight;

                totalWoodsCollected += currentWoods;
            }


        }
        if(totalWoodsCollected>=m){
            return true;

        }
        else{
            return  false;
        }
    }
    static int binarySearch(int[] trees, int m){
        int ans = -1;
        int s = 0; // starting point is 0
        int max = 0;

        for(int i = 0; i < trees.length; i++){
            if(trees[i] > max){
                max = trees[i];
            }
        }
        int e = max;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(trees, m, mid)){
                //agar mid pe jo trees katti woh true h toh chote value ko dhundenge tabhi maximus woods collect hoga
             ans = mid;
                s = mid +1;

            }
            else{
                s = mid +1;
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] trees = {20,15,10,17};
        System.out.println(binarySearch(trees,7));
    }
}
