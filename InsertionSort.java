class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {5,6,2,8,9,1,3,4,7};

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("After Sorting: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
      
}

//Output:-
// After Sorting: 1 2 3 4 5 6 7 8 9
