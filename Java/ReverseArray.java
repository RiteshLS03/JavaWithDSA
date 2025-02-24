// public class ReverseArray {

//     public static void reverseArray(int arr[]){

//         int start = 0 , end = arr.length - 1;

//         while(start < end){
//             int temp = arr[end];
//             arr[end] = arr[start];
//             arr[start] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void main(String args[]){

//         int arr[] = {2,4,6,8,10,12,14,20};
//         reverseArray(arr);

//         for(int i = 0; i < arr.length - 1 ; i++){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

public class ReverseArray {

    public static void reverseTheArr(int arr[]) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        reverseTheArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
}