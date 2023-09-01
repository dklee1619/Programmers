class Solution {
    fun solution(n: Int): Int {
        var n2 = n
        var answer: Int = 0
        var size = 17 // 1억은 3^17 이하 3^17은 Log로 8.xx  1억 log로 8
        var divisionArray: IntArray = IntArray(size)
        var remainderArray: IntArray = IntArray(size)
        var state = 0 // state 1이면 끝내기. 몫이 0~2면 다음 반복문때 끝내기 위함.
        var count = 0 // 얼마나 반복했는지 알기 위함.
        
        if(n<=3)
        {answer = n} // 3이하일 경우 내가 짠 논리로 안됨. 대신 n이 곧 답이됨.
        else{
        for(i in 0..size)
        {
            if(state == 1)
            {break}
            divisionArray[i] = n2 / 3
            remainderArray[i] = n2 % 3
            
            if(divisionArray[i]<=2)
            {state = 1}
            count++
            n2 = n2 / 3

        }
        answer = divisionArray[count-1]
        for(i in 0..count-1)
        {
            answer = answer + remainderArray[count-1-i] * Math.pow(3.0, (i+1).toDouble()).toInt()
        }}
        return answer
    }
}
// 1. 10진법 숫자를 3진법으로 바꾸기 위해서는
// 2. 생각중.. 45는 3으로 나누면 몫 15 나머지 0
// 2. 생각중.. 15는 3으로 나누면 몫 5 나머지 0
// 2. 생각중.. 5는 3으로 나누면 몫 1 나머지 2
// 3. 가장 마지막의 몫에서 몫3 -> 나머지3 -> 나머지2 -> 나머지1 이렇게 올라감
// 4. 그러면 n % 3 과 n / 3 을 배열에 각각 담고
// 5. 0번째 인덱스 * 3^(0) + 1번째 인덱스 * 3^(1) + 2번째 인덱스 * 3^(2) 이렇게 해보자
// 6. 제곱은 나중에 gpt에게 물어보고
// 7. log(10^8) = 8 log(3) = 0.4771 17 * 0.4771 = 8.xx n은 3^18 이하
// 8. count-1 로 마지막에 해줘야하는데 count로 해서 자꾸 잘못계산되다가 찾음. 
// 8. 자꾸 인덱스번호,크기 이런거 자꾸 1차이로 자꾸 계속 실수한다.
// 9. 그리고 제출후 채점에서 1개틀림. 아무래도 3이하일때가 안되는듯. 이런거도 계속 놓침.
// 10. 어짜피 1,2,3이면 답 도출과정결과 그대로 1,2,3으로 나와서 answer = n
// 11. gpt 답변 : https://chat.openai.com/share/1dfe38e1-1d50-4814-9337-316a2de9c591 