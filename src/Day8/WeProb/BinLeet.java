package Day8.WeProb;

public class BinLeet {
    public static void main(String[] args) {
        Solution1 binLeet = new Solution1();
       int[] nums = {-1,0,3,5,9,12};
       int target = 9;
        int res = binLeet.search(nums,target);
        System.out.println(res);
    }
}
class Solution1 {
    public int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(int)Math.floor((end-start)/2);

            if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid] == target){
                return mid;
            }
        }

        return -1;
    }
}
