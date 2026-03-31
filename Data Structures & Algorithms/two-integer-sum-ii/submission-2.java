
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r = numbers.length - 1;
        int l = 0;
        while(l<r){
            int sum = numbers[r] + numbers[l];
            if(sum == target){
                return new int[]{l+1,r+1};
            }
            else if(sum> target){
                r--;
            }
            else l++;
        }
        return new int[]{-1,-1};
        
        
        
    }
}

