   class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var charArray = phone_number.toCharArray()
        var size = charArray.size
        for (i in 0 until size - 4) {
            charArray[i] = '*'

        }
        answer = String(charArray)
        return answer
    }
}
    // 1. 문자열 데이터에 대해, 문자열의 길이를 가져오는 메서드를 gpt에게 물어 본 후
    // 2. 문자열 데이터에 대해, 문자열의 1~ n-4번째 요소를 *로 교체하는 메서드를 gpt에게 물어본다.
    // 방법 수정(이유: 메서드를 gpt가 통째로 알려주는 느낌이라, 별로 안좋아보임.)
    // 1. 그냥 문자열 데이터를 배열로 만드는 메서드를 이용해서 바꾸고
    // 2. 이후 배열을 다시 문자열 데이터로 바꿔주는 방식으로 수정
    // 3. 문자열 하나라서 char였는데 String이랑 자꾸 햇갈려서 오류 조금 겪음
    // 4. 자잘한 문법적인건 gpt에게 많이 물어봄
    // 5. gpt 답변 : https://chat.openai.com/share/b4230075-dcc2-4c3d-a379-478af23055cd
