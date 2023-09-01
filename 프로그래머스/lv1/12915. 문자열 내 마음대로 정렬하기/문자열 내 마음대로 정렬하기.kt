class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        var ca:CharArray = CharArray(strings.size)
        answer = Array(strings.size) { "" }
        var count = 0
        for(i in 0..strings.size-1)
        {
            ca[i] = strings[i].toCharArray()[n] // 비교할 요소를 담은 Char배열
        }
        for(i in 0..strings.size-1)
        {
            for(j in 0..strings.size-1)
            {
                if(strings[i].toCharArray()[n] > strings[j].toCharArray()[n]) 
                // 사전순이랑 크기랑 같은거같음 이렇게하니까 사전순 됨.
                {
                    count++
                }
                else if(strings[i].toCharArray()[n] == strings[j].toCharArray()[n])
                {
                    if(strings[i]>strings[j]) // 사전순이랑 크기랑 같은거같음 이렇게하니까 사전순 됨.
                    {
                        count++
                    }
                }
                
            }
            answer[count] = strings[i] // String[i] 에 대해 이거보다 작은 갯수를 count로 세줌.
            // 예시로 sun의 u는 a,e보다 크므로 작은갯수가 2고 2번째. 즉 최대 인덱스가 됨.
            count = 0 // 큰 for문 한번 돌때마다 count 초기화
        }
        return answer
    }
}

// 1. 크기가 주어지지 않은 배열은 add로 아마 원소 더해갈 수 잇었던거로 기억
// 2. char 원소도 크기를 비교할 수 있을텐데, 현재 원소보다 작은것을 count로 세서
// 3. 그 카운트를 answer의 인덱스로 하면 될듯
// 4. 사전순 배열은 나중에 생각하고 추가하자.