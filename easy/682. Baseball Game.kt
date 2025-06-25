// Solution 2.
class Solution {
    fun calPoints(operations: Array<String>): Int {
        val scores = mutableListOf<Int>()
        var totalPoints = 0

        for (op in operations) {
            when (op) {
                "+" -> {
                    val sum = scores[scores.size - 1] + scores[scores.size - 2]
                    scores.add(sum)
                    totalPoints += sum
                }
                "D" -> {
                    val double = scores.last() * 2
                    scores.add(double)
                    totalPoints += double
                }
                "C" -> {
                    totalPoints -= scores.removeAt(scores.size - 1)
                }
                else -> {
                    val value = op.toInt()
                    scores.add(value)
                    totalPoints += value
                }
            }
        }

        return totalPoints
    }
}

// Solution 1.
class Solution {
    fun calPoints(operations: Array<String>): Int {
        var totalPoint = 0
        val scores = mutableListOf<Int>()

        for (op in operations) {
            val integer = op.toIntOrNull()

            when (op) {
                "+" -> {
                    val idx = scores.size - 1
                    scores.add(scores[idx] + scores[idx - 1])
                }

                "D" -> {
                    val idx = scores.size - 1
                    val temp = scores[idx]
                    scores.add(temp * 2)
                }

                "C" -> {
                    scores.removeAt(scores.size - 1)
                }

                else -> {
                    scores.add(integer!!)
                }
            }
        }
        
        for (score in scores) {
            totalPoint += score
        }

        return totalPoint
    }
}
