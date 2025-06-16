class Solution {
    fun findClosest(x: Int, y: Int, z: Int): Int {
        val person1Distance = abs(x - z)
        val person2Distance = abs(y - z)
        
        return when {
            person1Distance == person2Distance -> 0
            person1Distance < person2Distance -> 1
            else -> 2
        }
    }
}
