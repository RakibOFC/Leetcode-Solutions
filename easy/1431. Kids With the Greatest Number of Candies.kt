fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val result = mutableListOf<Boolean>()

        for (i in candies.indices) {
            result.add((candies[i] + extraCandies) >= max)
        }
        return result
    }
