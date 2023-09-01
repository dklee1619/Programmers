class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var ca = charArrayOf()
         for(i in my_string.indices)
        {
            if(my_string[i].toInt()<=90)
            {ca = ca.plus((my_string[i].toInt() + 32).toChar())}
            else{ca = ca.plus((my_string[i].toInt() - 32).toChar())}
        } // 대문자를 소문자로 변경
        answer = ca.joinToString("")
        return answer
    }
}
// 1. 아스키코드 이용하면 풀수있음. 알아보기