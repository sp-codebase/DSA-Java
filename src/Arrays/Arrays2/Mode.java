package Arrays.Arrays2;

import java.util.HashMap;

public class Mode {

    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        // Find element with maximum frequency
        for (int key : freq.keySet()) {
            int currentKey = key;

            int currentKeyKiFreq = freq.get(key);

            if (currentKeyKiFreq > maxFreq) {
                maxFreq = currentKeyKiFreq;
                maxFreqWaliKey = currentKey;
            }
        }

        return maxFreqWaliKey;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 1, 7, 9, 7, 5, 5, 5};

        int ans = getMode(arr);
        System.out.println("Mode = " + ans);
    }
}