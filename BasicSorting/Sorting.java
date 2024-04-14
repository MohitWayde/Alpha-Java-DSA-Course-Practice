package BasicSorting;

public class Sorting {
    public static void printArray(int arr[]){
        System.out.println("Array After sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i] + " ");
		} 
    }


	public static void bubbleSort(int arr[]){
        int temp;
        // int n = arr.length;
        for (int turn=0;turn<arr.length-1;turn++) {
            for (int j=0;j<arr.length - 1 - turn;j++) {
                // System.out.println(arr.length-1-turn);
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		       
    }
    
    
    
    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++ ) {
            int minPos = i;
            for (int j=i+1;j<arr.length ;j++ ){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
        
    }
   
    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length ;i++) {
            int current = arr[i];
            
            int previous = i-1;
            while(previous>=0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous --;
            }
            arr[previous+1] = current;
            
        }
    }

	public static void main(String[] args) {
		int arr[] = {5,4,1,3,2};
		System.out.println("Array before sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i] + " ");
		} 
		System.out.println();

        System.out.println("Bubble Sort Output !");
		bubbleSort(arr);
		printArray(arr);
        // selectionSort(arr);
        // printArray(arr);
	    // insertionSort(arr);
	    // printArray(arr);
	    
	}
}
