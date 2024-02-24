import java.util.*;

public class LargestNumber {
    public static int getLargestNumber(int numbers[]) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 4};
        System.out.println("The largest number is: " + getLargestNumber(numbers));
    }
}
