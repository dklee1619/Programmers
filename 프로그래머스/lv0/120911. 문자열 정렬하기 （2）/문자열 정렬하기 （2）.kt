class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var ca = charArrayOf()
        var ca2 = charArrayOf()
        for(i in my_string.indices)
        {
            if(my_string[i].toInt()<=90)
            {ca = ca.plus((my_string[i].toInt() + 32).toChar())}
            else{ca = ca.plus(my_string[i])}
        } // 대문자를 소문자로 변경
        for(i in 97..122)
        {
            
            for(j in 0..ca.size-1)
            {
                if(i==ca[j].toInt())
                {
                    ca2 = ca2.plus(ca[j])
                }
            }
        }
        answer = ca2.joinToString("")
        return answer
    }
}

// 1. 문자열 데이터에 .toInt() 를 하면 아스키 코드가 된다.(by 김민종님)
// 2. 65~90까지가 알파벳 문자열 데이터 대문자
// 3. 97~122까지가 알파벳 문자열 데이터 소문자
// 4. 따라서 90아래면 +32 97이상이면 -32하고
// 5. 다시 toString으로
// 6. 오류 발생. my_string[i] = (my_string[i].toInt() + 32).toChar() 여기서.
// 7. 이유 : string은 불변한다고 함.
// 8. Char배열로 해결. 
// 9. 아스키 코드 : https://stepbystep1.tistory.com/10
// 10. gpt답변 : https://chat.openai.com/share/2db8a052-2e7e-493f-9a15-541272017e56