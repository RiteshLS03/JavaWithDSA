// public class BubbleSort {

//     public static void bubbleSortAlgo(int arr[]){
//         for(int i = 0; i < arr.length-1 ; i++){
//             for(int j = 0; j < arr.length-1-i; j++ ){

//                 if(arr[j] > arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] =  temp;
//                 }
//             }
//         }
//     }

//     public static void printSortedAlgo(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]);
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};

//         bubbleSortAlgo(arr);
//         printSortedAlgo(arr);
//         // System.out.println(arr);

//     }
// }

// ATTEMPT 2nd
// public class BubbleSort {
//     public static void bubbleSortAlgo(int arr[]){
//         for(int turn = 0; turn < arr.length; turn++){
//             for(int j = 0; j < arr.length-1-turn;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+(" "));
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
        
//         bubbleSortAlgo(arr);
//         printArr(arr);

//     }
// }