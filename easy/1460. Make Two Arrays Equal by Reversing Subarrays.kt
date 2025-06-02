class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        target.sort()
        arr.sort()

        for (i in target.indices) {
            if (target[i] != arr[i]) {
                return false
            }
        }
        return true
    }
}
