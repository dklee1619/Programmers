class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = -1
        val s = num.toString().toCharArray()
        val size = s.size
        for (i in 0..size-1)
        {
            if((s[i] == ((k + '0'.toInt()).toChar()))) {
               answer = i+1
                break
            }
        }
        return answer
    }
}

// 1. val s = num.toString().toCharArray()
// 2. val size = s.size
// 3. for (i in size) 검사