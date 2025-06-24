// Solution 2. (0ms)
class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        val freq = IntArray(101)
        var sum = 0
        
        for (num in nums) {
            freq[num]++
        }
        
        for (num in nums) {
            if (freq[num] == 1){
                sum += num
            }
        }
        
        return sum
    }
}

// Solution 1. (2ms)
class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        val n = nums.size
        var sum = 0

        for (i in 0..<n) {
            var isUnique = true
            for (j in 0..<n) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false
                    break
                }
            }
            if (isUnique) {
                sum += nums[i]
            }
        }
        
        return sum
    }
}
