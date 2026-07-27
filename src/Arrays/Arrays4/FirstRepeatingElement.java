package Arrays.Arrays4;


import java.util.HashMap;

public class FirstRepeatingElement {
    static int getRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        //frq
        for(int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        for(int i : arr){
            if(freq.get(i) > 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,3,2,2,3,3};

        System.out.println(getRepeatingElement(arr));

    }

}
