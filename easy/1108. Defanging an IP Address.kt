// Solution 3. (95ms)
class Solution {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}

// Solution 2. (88ms)
class Solution {
    fun defangIPaddr(address: String): String {
        var str = ""

        for (chr in address) {
            if (chr == '.') str += "[.]" else str += chr
        }
        
        return str
    }
}

// Solution 1. (86ms)
class Solution {
    fun defangIPaddr(address: String): String {
        val strBuilder = StringBuilder()

        for (chr in address) {
            if (chr == '.') strBuilder.append("[.]")
            else strBuilder.append(chr)
        }

        return strBuilder.toString()
    }
}
