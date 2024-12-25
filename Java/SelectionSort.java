public class SelectionSort {

    public static void selectionSortAlgo(int arr[]){
        for(int turn = 0; turn < arr.length; turn++){
            int minPos = turn;
            for(int j = turn + 1; j < arr.length - 1 ; j++){
                if(arr[minPos] < arr[j]){
                    minPos=j;
                }
            }
            // swap 
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void main (String args[]){
        int arr[] = {5,8,4,3,6,2,1};

        selectionSortAlgo(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.print( arr[i] +" ");
        }
    }
}
