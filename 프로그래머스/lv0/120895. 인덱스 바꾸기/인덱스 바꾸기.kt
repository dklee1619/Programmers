class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        val ca = my_string.toCharArray()
        val a = ca[num1]
        val b = ca[num2]
        ca[num1] = b
        ca[num2] = a
        answer = String(ca)
        return answer
    }
}

// 1. String형 데이터를 Char형 배열로
// 2. num1을 a에 저장
// 3. num2을 b에 저장
// 4. array[num1] = b , array[num2] = b
// 5. 이후 array를 string형 데이터로
// 6. 하려햇는데 그냥 string형 그대로 해도 되는듯은 안됨.
// 7. gpt에게 ca.toCharArray() // String형 데이터를 한글자 한글자 CharArray의 배열원소로
// 8. gpt에게 String(ca) // Char 배열의 원소를 합쳐서 String형 데이터로 까지 물어봄
// 9. gpt 답변 : https://chat.openai.com/share/b90a47c9-c6c5-402e-aaff-0e84d1660c7d