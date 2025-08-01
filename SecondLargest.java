public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
