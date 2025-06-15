class Solution {
    fun maximumTripletValue(nums: IntArray): Long {
        val n = nums.size
        var max = 0L

        for (i in 0..<n) {
            for (j in (i + 1)..<n) {
                for (k in (j + 1)..<n) {
                    
                    val temp = ((nums[i] - nums[j]) * nums[k].toLong())
                    if (max < temp) {
                        max = temp
                    }
                }
            }
        }

        return max
    }
}
