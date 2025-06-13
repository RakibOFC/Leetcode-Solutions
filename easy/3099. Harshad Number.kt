class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var num = x
        var sum = 0

        while (num >0 ){
            sum += num % 10
            num /= 10
        }

        return if (x % sum == 0) sum else -1
    }
}
