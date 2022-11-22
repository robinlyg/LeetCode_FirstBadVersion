public class Solution {
   static public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low +(high -low)/2;
            System.out.println("MID = " + mid + "\nLOW = " + low + "\nHIGH = " + high);
            if(nums[mid] == target)
            {
                return mid;
            }

            if(target > nums[mid])
            {
                low=mid+1;

                if(mid == nums.length-1)
                {
                    return nums.length;
                }
            }
            if(target < nums[mid])
            {
                high = mid-1;

            }

        }
        if(nums[mid] > target)
            return mid;
        else return mid+1;
    }

    public static void main(String[] args) {
        int[] n =  {1,3,5,6};
        int t =0;
        int t2 =2;
        int t3 = 7;
        int t4 = 4;

        System.out.println(searchInsert(n, t));
        System.out.println(searchInsert(n, t2));
        System.out.println(searchInsert(n, t3));
        System.out.println(searchInsert(n, t4));

    }

}
