

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Input: nums = [-1,0,1,2,-1,-4]

        // Output: [[-1,-1,2],[-1,0,1]]
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = -nums[i];
            int r = nums.length - 1;
            int l = i + 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;

                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;

                    }

                } else if (sum > target) {
                    r--;
                } else
                    l++;
            }
        }

        return result;
    }
}