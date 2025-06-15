class Solution {
    fun minimumSum(nums: IntArray): Int {
        val n = nums.size
        var minSum = Int.MAX_VALUE

        for (i in 0..<n) {
            for (j in (i + 1)..<n) {
                for (k in (j + 1)..<n) {
                    
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        val temp = nums[i] + nums[j] + nums[k]
                        
                        if (minSum > temp) {
                            minSum = temp
                        }
                    }
                }
            }
        }

        return if(minSum == Int.MAX_VALUE) -1 else minSum
    }
}
