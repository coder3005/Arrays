package PS6;

public class rotatedarray {
    public static int search(int[] nums, int target) {
        //min will have index of minimum element of nums
        int min = minSearch(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
        return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
        return search(nums,0,min,target);
        }
        }
        //binary search to find target in left to right boundary
        public static int search(int[] nums,int start,int end,int target){
        int s = start;
        int e = end;
        // System.out.println(left+" "+right);
        while(s <= e){
        int mid = (s+e)/2;
        if(nums[mid] == target){
        return mid;
        }
        else if(nums[mid] > target){
        e = mid-1;
        }
        else{
        s = mid+1;
        }
        }
        return -1;
        }
        //smallest element index
        public static int minSearch(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){ // also write start<=end
            int mid = (start + end)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
            return mid;
            }
            else if(nums[start] <= nums[mid] && nums[mid] > nums[end]){
            start = mid+1;
            }
            else{
            end = mid-1;
            }
            }
            return start;
            }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,1,2,3};
        System.out.println(search(nums,5));
    }
}
