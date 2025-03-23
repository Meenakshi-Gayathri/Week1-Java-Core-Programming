import java.util.*;

class ArrayIndexOutOfBoundsExceptionDemo {

    public static void createException(String[] arr) {
        System.out.println(arr[5]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }
        handleException(arr);
    }
}
