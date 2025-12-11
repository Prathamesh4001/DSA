public class Behavior {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*2;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}