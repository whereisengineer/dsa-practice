class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= 0;
        int p2= 0;

        while(p1 < nums1.length && p2 < n){
            if(nums1[p1] <= nums2[p2]){
                if(p1+1 < nums1.length && nums1[p1+1] >= nums2[p2]){
                    shiftbyone(nums1, p1+1);
                    for(int i : nums1)System.out.print(i+" ");
                    nums1[p1+1] = nums2[p2];
                    p2++;
                    p1++;
                }
                else{
                    p1++;
                }
            }else{
                shiftbyone(nums1, p1);
                nums1[p1] = nums2[p2];
                p1++;
                p2++;
            }
        }

        p1 = nums1.length-(nums2.length-p2);

        while(p2 < nums2.length){
            nums1[p1] = nums2[p2];
            p1++;
            p2++;
        }

    }

    public void shiftbyone(int[] nums, int k){
        int end = nums.length-2;
        while(end >= k){
            nums[end+1] = nums[end];
            end--;
        }
    }
        
}