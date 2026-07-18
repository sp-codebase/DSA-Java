package CollectionFramework;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println((n & (n-1)));
        System.out.println((n & (-n)));//last set bit
    }
}
