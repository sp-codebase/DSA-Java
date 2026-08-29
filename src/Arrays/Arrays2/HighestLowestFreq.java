package Arrays.Arrays2;

import java.util.HashMap;

public class HighestLowestFreq {
    static  int[]  getHighestLowestFreq(int []arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        //insert data
        for (int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        //hashmap is ready

        int highestFreq = Integer.MAX_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                //highest update  krna chahiye
                highestFreq = currentFreq;
                highestNum = currentKey;

            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }


        }
        int [] ans = {lowestFreq,lowestNum};
        return ans;
    }


    public static void main(String[] args){
        int [] arr = {1,1,1,1,2,3,4,5,2,2,2,3,3,4,5,5};
        int[] ans = getHighestLowestFreq(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
