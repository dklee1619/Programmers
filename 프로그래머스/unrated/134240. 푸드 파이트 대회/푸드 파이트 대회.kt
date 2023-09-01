class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var num: IntArray = IntArray(food.size)
        var size = 1
        var sum = 0
        for(i in 0..food.size-1)
        {num[i] = food[i]/2
            size = size + num[i] * 2 
        }      
        var ca: CharArray = CharArray(size)
        for(i in 1..food.size-1)
        {
            if(num[i]!=0)
            {
            for(j in sum..sum+num[i]-1)
            {
                ca[j] = (i + '0'.toInt()).toChar() // i.toChar() 를 (i + '0'.toInt()).toChar()로 교체
                 ca[size-1-j] = (i + '0'.toInt()).toChar()
            }
            }
            sum = sum + num[i]
        }
        
        ca[sum] = '0'
        answer = ca.joinToString("")
        return answer
    }
}

// 1. 해석한 결과는
// 2. food[0] = 1이고
// 3. food[1] = n일때 / 2만큼 해서 몫이 n1라면 char배열의 0~n1 그리고 (size-1)에서 뒤로 n2만큼 1을주고
// 4. food[2] = n2일때 / 2만큼 해서 몫이 n2라면 char배열의 (n1+1) ~ (n1+1 + n2) 그리고 (size-1 - n2 -1)에서 뒤로 n2만큼 2를주고
// 5. food[3] = n3일때 /2만큼 해서 몫이 n3라면 char배열의 (n1+1 + n2+1) ~ (n1+1 + n2+1 + n3) 그리고 (size-1 - n2 -1 -n3 -1)에서 뒤로 n3만큼 3을주고
// 6. (n1+1 + n2+1 + n3) + 1 에 0을 준다음
// 7. char배열을 string으로 바꿔주면 끝날듯 해보자.
// 8. char배열부터 만들어주자. 배열선언은 gpt를 통해
// 9. 논리는 잘 짰는데, 이제 음식갯수를 3개로 고정하고 짠거라 1~8개 모든 경우에 되도록 수정을 해줘야함.
// 10. size는 배열의 원소갯수 , IntArray(int형데이터) 는 int형데이터 갯수만큼 원소
// 10. // charArray = ['\u0000', '\u0001', '\u0002', '\u0003', '\u0004', '\u0005', '\u0006', '\u0007', '\b', '\t'] 이런식으로 '0','1','2' 가 아닌 \u0000 이런식으로 나와서 gpt에게 대답을받음.
// 11. 교체후에 채점해보니까 35점맞음. 뭐가 또 틀렸을까?
// 12. 디버그로 하니까 너무 찾기 편한데 이게 맞는건지는 모르겟다. 너무 쉽게 오류가발견되는데.
// 13. for(j in sum+num[i-1]..sum+num[i]-1) 이렇게 실수해서 
// 13. [1, , 2, , , 3 , , 3] 이렇게 건너띄게끔 하게 해버려서 +num[i-1] 날려버리니 잘됨.
// 14. gpt 답변 : https://chat.openai.com/share/a5e74d37-dbe7-44bb-a4a2-94c7bbf0ad0f