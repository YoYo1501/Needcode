class Solution {
    public int maxArea(int[] heights) {
          int r = heights.length - 1;
        int max = 0, l = 0;
        while( l < r){
            int water = Math.min(heights[l], heights[r])*(r-l);
            max = Math.max(max,water);
            if(heights[l] < heights[r]){
                l++;
            }
            else r--;
        }







        return max; 
        
    }
}
