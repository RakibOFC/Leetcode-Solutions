class Solution {
    fun sumOfMultiples(n: Int): Int {
        var sum = 0

        for (num in 1..n){
            if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                sum += num
            }
        }

        return sum
    }
}
