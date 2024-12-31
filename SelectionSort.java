class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,6,8,3,7,1};
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i < nums.length - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.print("After sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
//Output:-

// After sorting: 1 3 4 6 7 8 