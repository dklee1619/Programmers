class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var s = my_string.toCharArray()
        var s2: CharArray = charArrayOf()
        var size = s.size
        var state = 0
        for (i in 0..size - 1) {
            state = 0
            for (j in 0..s2.size - 1) {
                if (s[i] == s2[j]) {
                    state = 1
                }
            }
            if (state != 1) {
                s2 = s2.plus(s[i])
                state = 0
            }
        }
        answer = s2.joinToString("")
        return answer
    }
}
// 1. char 배열로
// 2. for i in 0..size-1 하고나서
// 3. 다시 for j in i+1 .. size-1 해서
// 4. i에 대해 i+1부터 size-1까지 검사해서 발견되는거 있으면
// 5. gpt에게 "코틀린 특정 배열 원소 인덱스를 입력해서 제거하는 메서드 plz" 질문 
// 6. 배열의 경우 제거하는건 딱히 없다고 함.
// 7. 문제. 검사하려는 인덱스가 작아지면 어떻게하지..
// 8. 사이즈도 같이 깎으면 될것 같긴함.
// 9. 없는 원소면 새로운 배열에 추가하는식으로 해야겟다.
// 10. 반복문 쪽 잘못된거같아서 싹 지우고 다시 짬.

// 11.s2 = s2.plus(s[i]) 인데 계속 s2.plus(s[i]) 로 해서 오류발생..
// 12.gpt 답변 : https://chat.openai.com/share/e8f5f3bd-55aa-460c-aae3-9be753fedcb6