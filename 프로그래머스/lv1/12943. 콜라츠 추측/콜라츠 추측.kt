class Solution {
    fun solution(num: Int): Int {
        var num2 = num
        var answer = 0
        var count: Int = 0
        if (num2 == 1) {
            answer = 0
        } else {
            while (!((num2 == 1) || (count == 500))) {
                if ((num2 % 2) == 0) {
                    num2 = num2 / 2
                } else if ((num2 % 2) == 1) {
                    num2 = num2 * 3 + 1
                }
                count++
            }
        }
        if (count == 500) {
            answer = -1
        } else {
            answer = count
        }
        return answer
    }
}