package ArraysManipulation;

import java.util.HashMap;

public class Mode {

    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mode = -1;

        // Find element with maximum frequency
        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mode = key;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 1, 7, 9, 7, 5, 5, 5};

        int ans = getMode(arr);
        System.out.println("Mode = " + ans);
    }
}