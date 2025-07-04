class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val n = nums.size
        val leftList = mutableListOf<Int>()
        val pivotList = mutableListOf<Int>()
        val rightList = mutableListOf<Int>()

        for (i in 0..<n) {
            if (pivot == nums[i]) {
                pivotList.add(nums[i])

            } else if (pivot > nums[i]) {
                leftList.add(nums[i])

            } else if (pivot < nums[i]) {
                rightList.add(nums[i])

            }
        }

        val newList = leftList + pivotList + rightList

        return newList.toIntArray()
    }
}
