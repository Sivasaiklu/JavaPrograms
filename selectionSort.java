public class selectionSort {
    public static void main(String[] args) {
        
        int arr[] = {10, 4, 1, 7, 21, 3};

        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int t = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = t;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
