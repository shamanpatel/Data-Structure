class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4,6,8,3,7,1};
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
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