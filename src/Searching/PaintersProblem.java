package Searching;

public class PaintersProblem {

    static boolean isValidAns(int[] boards, int k , int maxLength){
       int painterCount = 1;
       int paintedLength = 0;
       for(int i =0; i< boards.length; i++){

          if(paintedLength + boards[i] <= maxLength){
              //assin to current painter
              paintedLength += boards[i];
          }else{
              //no, assign to new painter
              painterCount++;
              paintedLength = 0;
              //if painters exceed k, answer is not possible

              if(painterCount>k || boards[i]>maxLength){
                  return false;
              }
              else{
                  //na to paintercount main problem na max

                  paintedLength += boards[i];
              }


          }

       }

       return true;
    }

    static  int binarySearch(int[] boards, int k){

       int sum = 0;
        for(int i = 0; i < boards.length; i++){

            sum += boards[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValidAns(boards,k,mid)){
                ans = mid;

                //move left to check further
                e = mid-1;

            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int [] boards = {10,20,30,40};
        System.out.println(binarySearch(boards,2));
    }

}
