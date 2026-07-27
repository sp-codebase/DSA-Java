package Arrays.Arrays1;

public class Avg {
    static double getAverage(int [] arr) {
        double sum = 0;
        for(int i : arr) {

            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,3,1};
        System.out.println(getAverage(arr));
    }
}
