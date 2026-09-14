package Searching;

public class Roti_Pratas {
    /* basically in this question we have to find minimum amount of time required for all pratas to be cooked
     p -> number of pratas, n -> number of cooks ,
     rank = time taken by cooks to cook the pratas
    */
    static  boolean isValidAns(int [] ranks, int p , int n , int timeLimit){
        int parataCount = 0;
        for(int i = 0; i< ranks.length; i++){

            int currentCookRank = ranks[i];

            int totalTimeTaken = 0;
            int j = 1;

            while(totalTimeTaken<=timeLimit){
                if(totalTimeTaken + j * currentCookRank <= timeLimit){
                    // it means parata can be cooked
                    totalTimeTaken = totalTimeTaken + j*currentCookRank;
                    parataCount++;
                    j++;

                }
                else{
                    break;
                }

                if(parataCount >= p){
                    return true;
                }
            }


        }
        if(parataCount >= p){
            return true;
        }
        else{
            return false;
        }
    }
    static int binarySearch(int[] ranks, int p , int n){
        int s = 0;
        int ans = -1;
        int max = 0;

        // to obtain the end we need worst of all time for example of cook 4 takes 4, 8, 12.. times to cook each pratas
        // then we need to add time taken by cook4

        for(int i = 0; i < ranks.length; i++){
            if(ranks[i] > max){
                max = ranks[i] * (p*(p+1)/2);
            }
        }

        int e = max;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValidAns(ranks,p,n,mid)){
                 ans = mid;
                 e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return  ans;
    }
    public  static  void main (String[] args){
        int[] ranks = {1};
        System.out.println(binarySearch(ranks,5,1));
    }

}
