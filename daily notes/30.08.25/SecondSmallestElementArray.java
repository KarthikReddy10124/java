public class SecondSmallestElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}
