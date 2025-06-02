// Solution 2. (145ms)
class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val newArr = IntArray(n * 2)
        var i = 0
        var j = n
        var k = 0

        for (l in 1..n) {
            newArr[k++] = nums[i++]
            newArr[k++] = nums[j++]
        }

        return newArr
    }
}

// Solution 1. (151ms)
class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val newArr = IntArray(n * 2)
        var i = 0
        var j = n

        for (k in newArr.indices) {
            if (k % 2 == 0) {
                newArr[k] = nums[i++]
            } else {
                newArr[k] = nums[j++]
            }
        }

        return newArr
    }
}
